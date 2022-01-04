package com.cincopuntouno.S51.modelo;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Collar")
public class ModeloCollar {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long Id;
	
	@Column(name="Autor")
	private String nombreAutor;
	
	@Column(name="Nombre del Collar")
	private String nombreCollar;
	
	@Column(name="Fecha de Entrada")
	private Date fechaEntrada;
	
	@Column(name="Tienda_Id")
	private Long idTienda;
	
	public ModeloCollar() {}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public String getNombreCollar() {
		return nombreCollar;
	}

	public void setNombreCuadro(String nombreCollar) {
		this.nombreCollar = nombreCollar;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public ModeloCollar(Long id, String nombreAutor, String nombreCuadro, Date fechaEntrada, Long Tienda_id) {
		super();
		Id = id;
		this.nombreAutor = nombreAutor;
		this.nombreCollar = nombreCollar;
		this.fechaEntrada = fechaEntrada;
		this.idTienda = Tienda_id;
	}

	public Long getIdTienda() {
		return idTienda;
	}

	public void setIdTienda(Long idTienda) {
		this.idTienda = idTienda;
	}
	
	
}
