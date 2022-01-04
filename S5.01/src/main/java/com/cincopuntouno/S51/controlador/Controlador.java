package com.cincopuntouno.S51.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cincopuntouno.S51.modelo.ModeloCollar;
import com.cincopuntouno.S51.modelo.ModeloTienda;
import com.cincopuntouno.S51.service.serviceTienda;

@RestController
@RequestMapping("")
public class Controlador {

		@Autowired
		serviceTienda servicio;

		
		@PostMapping("/shops")
		public ModeloTienda anadirTienda(@RequestBody ModeloTienda tiendaNueva) {
			return servicio.tiendaNueva(tiendaNueva) ;
			
		}

		@GetMapping("/shops")
		public ModeloTienda listarTienda(List<ModeloTienda> tiendas) {
			return servicio.listarTiendas();
		}
		
		@PostMapping("/shops/{ID}/pictures")
		public ModeloCollar anadirCuadro(@RequestBody ModeloCollar modeloCollar ) {
			return servicio.anadirCuadro(modeloCollar);
			
			
		}
		
		@GetMapping("/shops/{ID}/pictures")
		public ModeloCollar listarCuadrosdeTienda(@RequestBody Long id) {
			return (ModeloCollar) servicio.listaCuadro(id);
		}
		
		@DeleteMapping("/shops/{ID}/pictures")
		public String quemar(@RequestBody Long id) {
			servicio.deleteCuadros(id);
			return "Todos los collares han desaparecido";  
		}
		
		
		
}
