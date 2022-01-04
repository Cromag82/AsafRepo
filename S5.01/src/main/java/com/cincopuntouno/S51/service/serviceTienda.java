package com.cincopuntouno.S51.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cincopuntouno.S51.modelo.ModeloCollar;
import com.cincopuntouno.S51.modelo.ModeloTienda;
import com.cincopuntouno.S51.repo.whiteCollarRepo;

@Service
public class serviceTienda {
	
	@Autowired
	whiteCollarRepo wcr;
	
	public ModeloTienda tiendaNueva(ModeloTienda tienda) {
		wcr.save(tienda);
		return tienda;
	}
	
	public ModeloTienda listarTiendas() {
		return (ModeloTienda) wcr.findAll();
		
	}
	
	public ModeloCollar anadirCuadro(ModeloCollar nuevoCuadro) {
		wcr.save(nuevoCuadro);
		return nuevoCuadro;
		
	} 
	
	public List<ModeloCollar> listaCuadro(Long id_tienda) {
		return wcr.findByTienda(id_tienda);
		
	}
	
	public void deleteCuadros(Long id) {
		wcr.deleteAll();
	}

}
