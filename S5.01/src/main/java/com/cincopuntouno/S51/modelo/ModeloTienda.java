package com.cincopuntouno.S51.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tienda")
public class ModeloTienda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long Id;
	
	@Column(name="Tienda")
	private String nombreTienda;
	@Column(name="Capacidad Maxima")
	private int numMaxCollares;
	@Column(name="Collar_id")
	private Long collar_id;
	
	public ModeloTienda() {}

	public ModeloTienda(Long id, String nombreTienda, int numMaxCollares, Long collar_id) {
		super();
		Id = id;
		this.nombreTienda = nombreTienda;
		this.numMaxCollares = numMaxCollares;
		this.collar_id = collar_id;
		
		
	}

	public Long getCollar_id() {
		return collar_id;
	}

	public void setCollar_id(Long collar_id) {
		this.collar_id = collar_id;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNombreTienda() {
		return nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public int getNumMaxCollares() {
		return numMaxCollares;
	}

	public void setNumMaxCollares(int numMaxCollares) {
		this.numMaxCollares = numMaxCollares;
	}

	
	
	
	

}
