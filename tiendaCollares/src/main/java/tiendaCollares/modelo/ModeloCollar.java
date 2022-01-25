package tiendaCollares.modelo;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name = "collar")
public class ModeloCollar {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;
	
	@Column(name = "autor")
	private String nombreautor;
	
	@Column(name = "nombrecollar")
	private String nombrecollar;
	
	@Column(name = "fechaentrada")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaentrada;
	
	@Column(name = "precio")
	private float precio;
	
	@JsonIgnore
    @ManyToOne()
    @JoinColumn(name = "id_tienda")
	private ModeloTienda tienda; 
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
	
	public ModeloTienda getTienda() {
		return tienda;
	}


	public void setTienda(ModeloTienda tienda) {
		this.tienda = tienda;
	}

	public ModeloCollar() {}


	public String getNombrecollar() {
		return nombrecollar;
	}


	public void setNombrecollar(String nombrecollar) {
		this.nombrecollar = nombrecollar;
	}


	public java.util.Date getFechaentrada() {
		return fechaentrada;
	}


	public void setFechaentrada(java.util.Date fechaentrada) {
		this.fechaentrada = fechaentrada;
	}


	public String getNombreautor() {
		return nombreautor;
	}


	public void setNombreautor(String nombreautor) {
		this.nombreautor = nombreautor;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}



	
}