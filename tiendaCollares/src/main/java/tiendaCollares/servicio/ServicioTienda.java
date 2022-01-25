package tiendaCollares.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tiendaCollares.modelo.ModeloTienda;
import tiendaCollares.repositorio.TiendaRepo;

@Service
public class ServicioTienda  {

	@Autowired
	TiendaRepo tiendaDAO;
	
	public List<ModeloTienda> listarTienda() {
		return (List<ModeloTienda>) tiendaDAO.findAll();
		
	}
	
	public ModeloTienda nuevaTienda(ModeloTienda tienda) {
		return tiendaDAO.save(tienda) ;
		
	}
	
	
	

}
