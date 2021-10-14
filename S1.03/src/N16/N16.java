package N16;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class N16 {
	
	public static void main(String[] args) {
		
	LinkedList<Integer> lista = new LinkedList<Integer>();
	
	ListIterator <Integer> iteradorLista = new lista.listIterator();
	
	
	while (lista.listIterator() != null ) {
		lista.add(lista.size()/2, integer());
		System.out.println(lista);
	}
	

	}
	
	public static int integer() {
		Scanner scanner = new Scanner(System.in);
		int entrada;
		String stop = "";
		do {
		System.out.println("introduce un numero o aprete el intro para parar: ") ;
		entrada = scanner.nextInt(); 
		} 
		while (stop != "");
		return entrada;
		 }
		
	}
	

