package N3;

import java.util.ArrayList;
import java.util.Iterator;

public class Main{

	public static void main(String[] args) {
		//parte 1
		
		N3 contenedor = new N3(3);
		// nuevo elemento tipo N3 (o sea, un String[])
		contenedor.nuevoElemento("uno");
		contenedor.nuevoElemento("dos");
		contenedor.nuevoElemento("tres");
		final long startTime = System.nanoTime();
		contenedor.nuevoElemento("cuatro"); //aquí el método debería actuar y permitir agrandar el contenedor
		final long endTime = System.nanoTime();
		System.out.println("tiempo de inserción de un elemento String en Arrays: " + (endTime - startTime));
		
		ArrayList<String> contenedor2 = new ArrayList<String>();
		final long startTime2 = System.nanoTime();
		contenedor2.add("uno");
		
		final long endTime2 = System.nanoTime();
		System.out.println("tiempo de inserción de un elemento String en ArrayList:" + (endTime2 - startTime2));
		
		
		//parte 2
		N3 contenedorInt = new N3(3);
		// nuevo elemento tipo N3 (o sea, un String[])
		final long startTime3 = System.nanoTime();
		contenedorInt.nuevoElementoInt(1);
		contenedorInt.nuevoElementoInt(2);
		contenedorInt.nuevoElementoInt(3);
		contenedorInt.nuevoElementoInt(4); //aquí el método debería actuar y permitir agrandar el contenedor
		final long endTime3 = System.nanoTime();
		System.out.println("tiempo de inserción de 4 elementos int en Arrays: " + (endTime3 - startTime3));
		
		ArrayList<Integer> contenedor3 = new ArrayList<Integer>();
		final long startTime4 = System.nanoTime();
		contenedor3.add(1);
		contenedor3.add(2);
		contenedor3.add(3);
		contenedor3.add(4);
		final long endTime4 = System.nanoTime();
		System.out.println("tiempo de inserción de 4 elementos int en ArrayList:  " + (endTime4 - startTime4));
		
			
	}
}