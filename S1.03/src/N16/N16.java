package N16;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class N16 {
	
	public static void main(String[] args) {
		
	LinkedList<Integer> lista = new LinkedList<Integer>();
	
	ListIterator <Integer> iteradorLista = new lista.listIterator();
	
	
	do {  
		lista.add(lista.size()/2, integer());
		System.out.println(lista);
	} while (lista.listIterator() != null ); 
		
	
	

	}
	
	public static int integer() {
		Scanner scanner = new Scanner(System.in);
		int entrada;
		do {
		System.out.println("introduce un numero o aprete el intro para parar: ") ;
		entrada = scanner.nextInt();
		return entrada;
		} 
		while (Integer.toString(entrada) != "");
		
		 }
		
	}
	

