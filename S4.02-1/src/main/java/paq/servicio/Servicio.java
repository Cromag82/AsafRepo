package paq.servicio;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.multipart.MultipartFile;

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
	
	public String addFoto(MultipartFile archivo) {
		String mensaje = null;
    	try {
    		if (!archivo.isEmpty()) {
    			Path rootPath = Paths.get("uploads").resolve(archivo.getOriginalFilename()).toAbsolutePath();
    			Files.copy(archivo.getInputStream(), rootPath);
    			mensaje = "Fichero subido exitosamente"; 
    					
    		} else {
    			mensaje = "Fichero vacío o incorrecto";
    		}
    		
    	} catch (Exception e) {
    		mensaje=e.getMessage();
    	} return mensaje;	
	}
	
	
	
}
