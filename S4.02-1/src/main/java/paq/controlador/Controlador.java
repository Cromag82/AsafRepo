

package paq.controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import paq.enumerador.Oficios;
import paq.modelo.Trabajador;
import paq.repositorio.Repositorio;
import paq.servicio.Servicio;


	@RestController
	@RequestMapping
	public class Controlador {

		@Autowired
		Servicio service;
			
		
		//1. Read
		@GetMapping("/trabajadores")
		public ArrayList<Trabajador> getListaTrabajadores() {
			return service.obtenerTrabajadores();
					
		}
		
		//2.Create
		@PostMapping("/trabajador")
		public Trabajador insertTrabajador(@RequestBody Trabajador trabajador) {
			return service.nuevoTrabajador(trabajador);
		
		}
		
		//3.Update
		@PutMapping("/trabajador")
		public Trabajador updateTrabajador(@RequestBody Trabajador trabajador) {
			return service.updateTrabajador(trabajador);
		
		} 
		
		//4.Delete
		@DeleteMapping("/trabajador")
		public String deleteTrabajador(@RequestBody Trabajador trabajador) {
			return service.deleteTrabajador(trabajador);
		
		}
		
		//Crea una petició HTTP especial que busqui empleats per feina
		//2.1.Buscar por feina
		@GetMapping("/perfeina")
		public ArrayList<Trabajador> getListaPorFeina(Oficios feina) {
			return (ArrayList<Trabajador>) service.getListPorFeina(feina);
		
		}
		
	
	}