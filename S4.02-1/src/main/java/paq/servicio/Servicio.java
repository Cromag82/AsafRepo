package paq.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import paq.enumerador.Oficios;
import paq.modelo.Trabajador;
import paq.repositorio.Repositorio;

@Service
public class Servicio {
	
	@Autowired
	Repositorio repositorio;
	
	
	public ArrayList<Trabajador> obtenerTrabajadores() {
		return (ArrayList<Trabajador>) repositorio.findAll();
	}
	
	public Trabajador nuevoTrabajador(Trabajador trabajador) {
		return repositorio.save(trabajador);
		
	}
	
	public Trabajador updateTrabajador(Trabajador trabajador) {
		return repositorio.save(trabajador);
	}
	
	public String deleteTrabajador(Trabajador trabajador) {
		repositorio.delete(trabajador);
		return "Usuario eliminado";
	}
	
	public List<Trabajador> getListPorFeina(Oficios feina) {
		return repositorio.findByFeina(feina);
			
		}	
	
	
	
	
}
