package N11N12;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Month> month = new ArrayList<Month>();
	
		month.add(new Month("Enero"));
		month.add(new Month("Febrero"));
		month.add(new Month("Marzo"));
		month.add(new Month("Abril"));
		month.add(new Month("Mayo"));
		month.add(new Month("Junio"));
		month.add(new Month("Julio"));
		month.add(new Month("Septiembre"));
		month.add(new Month("Octubre"));
		month.add(new Month("Noviembre"));
		month.add(new Month("Diciembre"));
		
		month.add(7,new Month("Agosto")); //AÑADO AGOSTO EN UNA POSICIÓN CONCRETA
				
	    try { //INTENTO NO DUPLICAR LOS VALORES
	    	month.add(new Month("Enero"));
			month.add(new Month("Febrero"));
			month.add(new Month("Marzo"));
			month.add(new Month("Abril"));
	    }
	    catch (Exception e) {
	    	System.out.println("Los valores no se duplican");
	    }
	    finally {
	    	System.out.println("Los valores se duplican");
	    }
	    // LOS VALORES SÍ SE DUPLICAN, UTILIZAR MEJOR UN HASHSET
	    
	    HashSet<Month> monthHash = new HashSet<Month>();
	    for (Month meses:month) {
	    	monthHash.add(meses);
	    	    }
	    
	    System.out.println(monthHash); 
	    // en efecto rellenamos todos los campos de month en monthHash
	    
	    for (Month meses:monthHash) {
	    	System.out.println(meses.getMonth());
	    // con el getter del campo creado, podemos ver el interior de cada elemento
	    }
	    
	    
	}

	private static char[] monthHash(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
