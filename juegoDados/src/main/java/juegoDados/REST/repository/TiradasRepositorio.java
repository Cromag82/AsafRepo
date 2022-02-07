package juegoDados.REST.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import juegoDados.REST.entity.Tirada;

public interface TiradasRepositorio extends MongoRepository<Tirada,Serializable>{

}
