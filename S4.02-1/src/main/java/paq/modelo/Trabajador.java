package paq.modelo;


import javax.persistence.Entity;

import paq.enumerador.Oficios;

import javax.persistence.*;


@Entity
@Table(name="Trabajador")
public class Trabajador {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(unique=true, nullable=false)
		private Long id; 
		
		private String nom;
		private double salari;
		private Oficios feina;
		
		public Trabajador(Long id, String nom, double salari, Oficios feina) {
			
			this.id = id;
			this.nom = nom;
			this.salari = salari;
			this.feina = feina;
		}
		public Trabajador() { //contructor por defecto IMPEPINABLE
				}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
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
		
		
