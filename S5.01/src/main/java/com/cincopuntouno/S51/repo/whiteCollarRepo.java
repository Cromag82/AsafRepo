package com.cincopuntouno.S51.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cincopuntouno.S51.modelo.ModeloCollar;
import com.cincopuntouno.S51.modelo.ModeloTienda;



@Repository
public interface whiteCollarRepo extends CrudRepository{
	
	List<ModeloCollar> findByTienda(Long idTienda) ;

}