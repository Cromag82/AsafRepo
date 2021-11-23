package S301n2;

import java.util.HashMap;

import AbstractFactory.Factoria;
import AbstractFactory.FactoriaAbstracta;
import Agendas.Agenda;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factoria n = new Factoria();
				
		FactoriaAbstracta n1 = n.getAgenda("España");
		n1.anadirEntrada();
		n1.eliminarEntrada();
		
		FactoriaAbstracta n2 = n.getAgenda("England");
		n2.anadirEntrada();
		n2.eliminarEntrada();
		
		
	}
	
}
