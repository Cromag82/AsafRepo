package juegoDados.REST.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mongodb.lang.NonNull;

@Document(collection = "Jugador")
public class Jugador implements Serializable {
	
	@Id 
	@NonNull
	private Long id;
	
	@Field(name = "nombre")
	private String nombre;
	
	@Field(name = "numjugadas")
	private int numjugadas;
	
	@Field(name = "fechaentrada")
	@Basic
	@Temporal(TemporalType.TIMESTAMP)
//	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private java.util.Date fechaentrada;
	
	
	@Field(name = "% exito")
	private Double exito;
	
	@Field(name = "tiradas")
	@OneToMany()
	private Tirada tirada;
	
	public Jugador() {}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getnumjugadas() {
		return numjugadas;
	}

	public void setnumjugadas(int numjugadas) {
		this.numjugadas = numjugadas;
	}

	public Date getFechaentrada() {
		return fechaentrada;
	}

	public void setFechaentrada(Date fechaentrada) {
		this.fechaentrada = fechaentrada;
	}


	public Double getExito() {
		return exito;
	}


	public void setExito(Double exito) {
		exito = (double) ((tirada.getVictorias()/(tirada.getVictorias()+tirada.getDerrotas()))*100);
		this.exito = exito;
	}


	public int getNumjugadas() {
		return numjugadas;
	}


	public void setNumjugadas(int numjugadas) {
		this.numjugadas = numjugadas;
	}


	public Tirada getTirada() {
		return tirada;
	}


	public void setTirada(Tirada tirada) {
		this.tirada = tirada;
	}

	
}
