package AbstractFactory;

import Agendas.Espa�a;
import Agendas.noAgenda;

public class Factoria {
	
	
		public FactoriaAbstracta getAgenda(String a) {
			if (a==null) {
				return new noAgenda(); 
			}
			if (a.equalsIgnoreCase("Espa�a")) {
				return new Espa�a();
			}
			if (a.equalsIgnoreCase("England")) {
				return new Espa�a();
			}		
			
			return new noAgenda();
				
		
			

}
}
