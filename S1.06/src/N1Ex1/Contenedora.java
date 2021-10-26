package N1Ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Contenedora {
	
	
	private String[] objeto = new String[3];
	private Scanner entrada = new Scanner(System.in);
	
	public Contenedora (String obj1, String obj2, String obj3) {
	objeto[0] = obj1;
	objeto[1] = obj2;
	objeto[2] = obj3;
		
		
	}
	
	public void insertarObjetos() {
	
		for (int i = 0;i<objeto.length;i++) {
			System.out.println("Inserta un objeto de tipo String: ");
			objeto[i] = new String(entrada.next());
			
		}
		
	}
	
	public void retornarObjetos() {
		System.out.println( "Los objetos del contenedor son:") ;
		for (int i = 0; i<objeto.length;i++) {
			System.out.println(objeto[i]);
			
		}
		
		
	}
}
