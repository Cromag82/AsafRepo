package Agendas;

import java.util.ArrayList;
import java.util.HashMap;

import AbstractFactory.FactoriaAbstracta;

public class England implements FactoriaAbstracta {

	
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

	public int getPrefijo() {
		return 0044;
	}


	
}

