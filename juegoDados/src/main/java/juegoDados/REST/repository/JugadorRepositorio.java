package juegoDados.REST.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import juegoDados.REST.entity.Jugador;

@Repository
public interface JugadorRepositorio extends MongoRepository<Jugador,Serializable> {
	
	public Optional<Jugador> findByNombre(String nombre);
	
} 
