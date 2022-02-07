package juegoDados.REST.entity;

import java.util.Random;

import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.mongodb.lang.NonNull;

@Document (collection = "Tirada")
public class Tirada {

	@Id 
	@NonNull
	private Long id;
	
	@Field(name = "dado1")
	private int dado1;
	
	@Field(name = "dado2")
	private int dado2;
	
	private String vicder;
	
	@Field(name = "num victorias")
	private int victorias;
	
	@Field(name = "num derrotas")
	private int derrotas;
	
	@ManyToOne()
	@Field(name = "id_jugador")
	long id_jugador;
	
	public Tirada() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getDado1() {
		return dado1;
	}

	public void setDado1(int dado1) {
		this.dado1 = dado1;
	}

	public int getDado2() {
		return dado2;
	}

	public void setDado2(int dado2) {
		this.dado2 = dado2;
	}

	public String getVicder() {
		return vicder;
	}

	public void setVicder(String vicder) {
		this.vicder = vicder;
	}
	
	
	
	public String tiraLosDados(long id_jugador) {
		dado1 = (int)(Math.random()*(6-1+1)+1);
		setDado1(dado1);
		dado2 = (int)(Math.random()*(6-1+1)+1);
		setDado1(dado1);
		
		if (dado1+dado2 == 7) {
				vicder = "Victoria";
				setVicder(vicder);
				victorias=+1;
			} else{
				vicder = "no has sumado 7";
				setVicder(vicder);
				derrotas=+1;

			} return vicder;
	
	}

	public int getVictorias() {
		return victorias;
	}

	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public long getId_jugador() {
		return id_jugador;
	}

	public void setId_jugador(long id_jugador) {
		this.id_jugador = id_jugador;
	}
	
}
