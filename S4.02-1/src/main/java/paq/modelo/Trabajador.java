package paq.modelo;


import javax.persistence.Entity;

import paq.enumerador.Oficios;

import java.io.File;
import java.util.ArrayList;

import javax.persistence.*;


@Entity
@Table(name="Trabajador")
public class Trabajador {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(unique=true, nullable=false)
		private int id; 
		
		private String nom;
		private double salari;
		private Oficios feina;
		private File foto;
		
		
		public Trabajador(int id, String nom, double salari, Oficios feina, File foto) {
			
			this.id = id;
			this.nom = nom;
			this.salari = salari;
			this.feina = feina;
			this.foto = foto;
		}
				
		public File getFoto() {
			return foto;
		}

		public void setFoto(File foto) {
			this.foto = foto;
		}

		public Trabajador() { //contructor por defecto IMPEPINABLE
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public double getSalari() {
			return salari;
		}

		public void setSalari(double salari) {
			this.salari = salari;
		}

		public Oficios getFeina() {
			return feina;
		}

		public void setFeina(Oficios feina) {
			this.feina = feina;
		}
		
	
}
		
		
