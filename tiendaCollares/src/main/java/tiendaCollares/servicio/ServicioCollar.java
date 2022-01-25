package tiendaCollares.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tiendaCollares.modelo.ModeloCollar;
import tiendaCollares.repositorio.CollarRepo;

@Service
public class ServicioCollar {
	
	@Autowired
	CollarRepo cr;
	
	public void nuevoCollar(ModeloCollar nuevo) {
		cr.save(nuevo);
	}
	
	public void quemarTienda() {
		cr.deleteAll();
	}
	

}
