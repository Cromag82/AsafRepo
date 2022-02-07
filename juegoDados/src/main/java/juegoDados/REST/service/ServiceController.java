package juegoDados.REST.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import juegoDados.REST.entity.Jugador;
import juegoDados.REST.entity.Tirada;
import juegoDados.REST.repository.JugadorRepositorio;
import juegoDados.REST.repository.TiradasRepositorio;

@Service
@Transactional
public class ServiceController {
	
	@Autowired
	JugadorRepositorio jugadorDAO;
	
	@Autowired
	TiradasRepositorio tiradaDAO;
	
		
	//	POST: /players : crea un jugador 
	public String nuevoJugador(Jugador jugadorNuevo) {
		jugadorDAO.save(jugadorNuevo);
		return "Jugador nuevo creado";
	}
	
	// PUT /players : modifica el nom del jugador 
	public String cambioNombre(Jugador jugador, String nombre) {
		jugador.setNombre(nombre);
		return "Nombre modificado";
	} 
	
	//POST /players/{id}/games/ : un jugador específic realitza una tirada  dels daus.  
	public String jugarLosDados(Long id) {
		Tirada tiradaNueva = new Tirada();
		return	tiradaNueva.tiraLosDados(id);
		
	}
	
	//DELETE /players/{id}/games: elimina les tirades del jugador 
	public String borrarTiradas(Long id) {
		tiradaDAO.deleteById(id);
		return "Tiradas eliminadas";
		
	}
	
	//GET /players/ retorna el llistat de tots  els jugadors del sistema  amb el seu  percentatge mig  d’èxits   
	public Map<String, Double> listarJugadoresConExito() {
		
		List<Jugador> listaJugador = jugadorDAO.findAll();
		Map<String, Double> listarJugadorYExito = new HashMap<String, Double>();
			
		if ((listaJugador != null) && (listaJugador.size()>0)) {
			String key = "";
			Double exito = null;
			for (int i = 0; i <= listaJugador.size(); i++) {
				key = listaJugador.get(i).getNombre();
				exito = listaJugador.get(i).getExito();
				listarJugadorYExito.put(key, exito);
			}
			
		}return listarJugadorYExito;
	}
	
	// GET /players/{id}/games: retorna el llistat de jugades per un jugador.  
	public List<Tirada> getTiradas(Long id) {
		Optional<Jugador> tiradas = jugadorDAO.findById(id);
		return (List<Tirada>) tiradas.get().getTirada();
				
	}
	
	// GET /players/ranking: retorna el ranking  mig de tots els jugadors del sistema .  És a dir, el  percentatge mig  d’èxits. 
	
	public String getRankingExito() {
		List<Jugador> tiradas = jugadorDAO.findAll();
		Double append = 0.0;
		for (int i=0;i<=tiradas.size();i++) {
			append += tiradas.get(i).getExito();
			
		} 
		
		return "El % medio de exito es: " + append/tiradas.size();
	}
	
	//GET /players/ranking/loser: retorna el jugador  amb pitjor percentatge d’èxit  
	public String getMenor() {
		Map<String, Double> listado = listarJugadoresConExito();
		List<Entry<String, Double>> list = new ArrayList<>(listado.entrySet());
		list.sort(Entry.comparingByValue());
			
		return "El jugador con menor ratio de éxito es: " + list.get(0)  ;
	}
	
	//	GET /players/ranking/winner: retorna el  jugador amb  millor percentatge   d’èxit 
	public String getMayor() {
		Map<String, Double> listado = listarJugadoresConExito();
		List<Entry<String, Double>> list = new ArrayList<>(listado.entrySet());
		list.sort(Entry.comparingByValue());
			
		return "El jugador con mayor ratio de éxito es: " + list.get(list.size()-1)  ;
	}
}
