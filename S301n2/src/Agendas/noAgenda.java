package Agendas;

import AbstractFactory.FactoriaAbstracta;

public class noAgenda implements FactoriaAbstracta {

	@Override
	public void anadirEntrada() {
		System.out.println("no hay entrada para introducir");
		
	}

	@Override
	public void eliminarEntrada() {
		System.out.println("no hay entrada para eliminar");
		
	}
	
	
}
