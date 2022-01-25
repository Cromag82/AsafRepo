package tiendaCollares.controlador;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.TemporalType;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tiendaCollares.modelo.ModeloCollar;
import tiendaCollares.modelo.ModeloTienda;
import tiendaCollares.repositorio.CollarRepo;
import tiendaCollares.repositorio.TiendaRepo;
import tiendaCollares.servicio.ServicioCollar;
import tiendaCollares.servicio.ServicioTienda;

@RestController
@RequestMapping("")
public class Controlador {
	
	@Autowired
	ServicioTienda st;
	@Autowired
	ServicioCollar sr;
	@Autowired
	CollarRepo collarDAO;
	@Autowired
	TiendaRepo tiendaDAO;
	
	@PostMapping (value = "/shops")
	public ModeloTienda nuevaTienda(@RequestBody ModeloTienda tienda) {
		ModeloTienda tiendaNuevo = st.nuevaTienda(tienda);
		return tiendaNuevo;
		
	}
	
	@GetMapping (value = "/shops")
	public ResponseEntity<List<ModeloTienda>> listaTienda() {
		return ResponseEntity.ok(tiendaDAO.findAll());
	}

	@Transactional
	@PostMapping (value = "shops/{id}/pictures")
	public ResponseEntity<ModeloCollar> saveById(@RequestBody ModeloCollar collar, @PathVariable ("id") Long tienda_Id) {
		Optional<ModeloTienda> buscame = tiendaDAO.findById(tienda_Id);  
		ModeloTienda tienda = buscame.get();  
		if (buscame.isPresent() && ((tienda.getCollar().size()) <= tienda.getNumMaxCollares()))  {
			collar.setTienda(tienda);
			collarDAO.save(collar);
			return (ResponseEntity<ModeloCollar>) ResponseEntity.ok(collar);	
		  } else {
			  return ResponseEntity.noContent().build();
		  }
	}
	
	@GetMapping (value = "shops/{id}/pictures")
	public ResponseEntity<List<ModeloCollar>> listbyId(@PathVariable ("id") Long tienda_Id) {
		Optional<ModeloTienda> buscame = tiendaDAO.findById(tienda_Id);
			if (buscame.isPresent()) {
				List<ModeloCollar> listado = collarDAO.findByTienda(buscame.get());
				return  ResponseEntity.ok(listado);	
			  } else {
				  return ResponseEntity.noContent().build();
			}
	}	
	
	@Transactional 
	@DeleteMapping (value = "shops/{id}/pictures")
	public ResponseEntity<String> deletebyId(@PathVariable ("id") Long tienda_Id) {
		Optional<ModeloTienda> buscame = tiendaDAO.findById(tienda_Id);
		if (!buscame.isEmpty() ) {
			collarDAO.deleteAllByTienda(buscame.get());
			return (ResponseEntity<String>) ResponseEntity.ok("La tienda se ha quemado y los cuadros se han fundido");	
		  } else {
			  return ResponseEntity.noContent().build();
		}
		
	}
}