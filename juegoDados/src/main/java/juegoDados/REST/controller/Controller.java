package juegoDados.REST.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import juegoDados.REST.entity.Jugador;
import juegoDados.REST.entity.Tirada;
import juegoDados.REST.repository.JugadorRepositorio;
import juegoDados.REST.repository.TiradasRepositorio;
import juegoDados.REST.service.ServiceController;

@RestController
@RequestMapping("/")
public class Controller {
	
	@Autowired
	JugadorRepositorio jugadorDAO;
	@Autowired
	TiradasRepositorio tiradaDAO;
	@Autowired
	ServiceController service;
	
	// POST/players : crea un jugador -- Esta formula tiene un error!! Entra independientemente de la repetición
	@PostMapping ("/players")
	public ResponseEntity<Jugador> newPlayer(@RequestBody Jugador jugador) {
		Optional<Jugador> buscame = jugadorDAO.findByNombre(jugador.getNombre());
		if (!buscame.isPresent() || jugador.getNombre() == "anonimo") {
			service.nuevoJugador(jugador);
			return ResponseEntity.ok(jugador);
		}
		else {
			return ResponseEntity.badRequest().build();
		}
	}	
		
	// cambiar el nombre del jugador 
	@PutMapping ("/players") 
	public ResponseEntity<Jugador> changeName(@RequestBody Jugador jugador, String nombreNuevo) {
		Optional<Jugador> buscame = jugadorDAO.findByNombre(jugador.getNombre());
		if (buscame.isPresent()) {
			service.cambioNombre(jugador, nombreNuevo);
			return ResponseEntity.ok(jugador);
		}
		else {
			return ResponseEntity.badRequest().build();
		}

	}
	
	//POST /players/{id}/games/ : un jugador específic realitza una tirada  dels daus.  
	@PutMapping ("/players/{id}/games") 
	public ResponseEntity<String> tiraLosDados(@PathVariable("id") Long id) {
		Optional<Jugador> nuevoJugador = jugadorDAO.findById(id);
			if (nuevoJugador.isPresent()) {
				return ResponseEntity.ok(service.jugarLosDados(id));
	} else {
				return ResponseEntity.badRequest().build();
			}
	
	}
	
	//DELETE /players/{id}/games: elimina les tirades del jugador 
	@DeleteMapping ("/players/{id}/games") 
	public ResponseEntity<String> eliminaTiradas(@PathVariable("id") Long id) {
		Optional<Jugador> nuevoJugador = jugadorDAO.findById(id);
		if (nuevoJugador.isPresent()) {
			return ResponseEntity.ok(service.borrarTiradas(id));
		}	else {
			return ResponseEntity.badRequest().build();
			} 
	
	}
	
	//GET /players/: retorna el llistat de tots  els jugadors del sistema  amb el seu  percentatge mig  d’èxits   
	@GetMapping ("/players")
	public ResponseEntity<Map<String, Double>> getJugadores() {
		return ResponseEntity.ok(service.listarJugadoresConExito());
	}
	
	// GET /players/{id}/games: retorna el llistat de jugades per un jugador.  
	@GetMapping ("/players/{id}/games") 
	public ResponseEntity<List<Tirada>> listarTiradas(@PathVariable("id") Long id) {
		return ResponseEntity.ok(service.getTiradas(id));
	}
	
	//GET /players/ranking
	@GetMapping ("/players/ranking")
	public ResponseEntity<String> getRanking() {
		return ResponseEntity.ok(service.getRankingExito());
	}
	
	//GET /players/ranking/loser: retorna el jugador  amb pitjor percentatge d’èxit  
	@GetMapping ("/players/ranking/loser")
	public ResponseEntity<String> getLoser() {
		return ResponseEntity.ok(service.getMenor());

	} 
	//GET /players/ranking/winner: retorna el jugador  amb millor percentatge d’èxit  
	@GetMapping ("/players/ranking/winner")
	public ResponseEntity<String> getWinner() {
		return ResponseEntity.ok(service.getMayor());

	} 
	
}
