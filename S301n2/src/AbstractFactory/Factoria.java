package AbstractFactory;

import Agendas.España;
import Agendas.noAgenda;

public class Factoria {
	
	
		public FactoriaAbstracta getAgenda(String a) {
			if (a==null) {
				return new noAgenda(); 
			}
			if (a.equalsIgnoreCase("España")) {
				return new España();
			}
			if (a.equalsIgnoreCase("England")) {
				return new España();
			}		
			
			return new noAgenda();
				
		
			

}
}
