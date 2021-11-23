package Agendas;

import java.util.ArrayList;
import java.util.HashMap;

import AbstractFactory.FactoriaAbstracta;

public class Agenda implements FactoriaAbstracta{
	
	private String direccion;
	private int prefijo;
	private int numero;

	public Agenda(String direccion, int prefijo, int numero) {
		super();		
		this.direccion = direccion;
		this.prefijo = prefijo;
		this.numero = numero;
		
		
	}
	@Override
	public void anadirEntrada() {
		HashMap<String,String> n = new HashMap<String,String>();
		n.put(null,null);
	}
	
	@Override
	public void eliminarEntrada() {
		HashMap<String,String> n = new HashMap<String,String>();
		n.remove(null,null);
		
	}
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(int prefijo) {
		this.prefijo = prefijo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
