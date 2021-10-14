package N15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class N15 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		lista1.add(4);
		lista1.add(5);
		
		lista2.add(10);
		lista2.add(9);
		lista2.add(8);
		lista2.add(7);
		lista2.add(6);
		
		ListIterator <Integer> iteradorLista1 = lista1.listIterator(lista1.size());
		ListIterator <Integer> iteradorLista2 = lista2.listIterator();
		
		while (iteradorLista1.hasPrevious()) {
			iteradorLista2.add(iteradorLista1.previous());
		}
		
		
		
		System.out.println(lista2);
		
		
		
		/*
		for (int i= lista1.size(); i>= 0;i--) {
				int temp = lista1.get(i);
				lista2.add(temp);
		}
		
		System.out.println(lista2);
		
		
	}
	
	public static <T> void iterador (Collection<T> c) { //crear un metodo iterador 
		Iterator<T> ite = c.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
*/
}
}
