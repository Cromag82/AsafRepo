package N14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import N13.Generadora;

public class Main {

	public static <T> void iterador (Collection<T> c) { //crear un metodo iterador 
		Iterator<T> ite = c.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		N14 n14 = new N14("nuevo");
		
		LinkedHashSet<N14> nuevoLHS = new LinkedHashSet<N14>();
		nuevoLHS.add(new N14("uno") );
		nuevoLHS.add(new N14("dos") );
		
		LinkedList<N14> nuevoLL = new LinkedList<N14>();
		nuevoLL.add(new N14("uno") );
		nuevoLL.add(new N14("dos") );
		
		TreeSet<N14> nuevoTS = new TreeSet<N14>();
		nuevoTS.add(new N14("uno") );
		nuevoTS.add(new N14("dos") );
		
		
		HashSet<N14> nuevoHS = new HashSet<N14>();
		nuevoHS.add(new N14("uno") );
		nuevoHS.add(new N14("dos") );
		
		ArrayList<N14> nuevoAL = new ArrayList<N14>();
		nuevoAL.add(new N14("uno") );
		nuevoAL.add(new N14("dos") );
		
		iterador(nuevoLHS);
		iterador(nuevoLL);
		iterador(nuevoAL);
		iterador(nuevoTS);
		iterador(nuevoHS);
		
		/*
		  
		iterador tipo 1
		for (int i=0;i < nuevoAL.size(); i++) {
			System.out.println(nuevoAL.get(i));
		}

		iterador tipo 2
		for (N14 nuevo:nuevoAL) {
			System.out.println(nuevo);
		}
		
		iterador tipo 3 // ESPECIALMENTE UTILIZA ESTA FORMA PARA BORRAR
		
		Iterator<N14> ite = nuevoAL.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		*/
		
		
		
		
		
		
		
		


	}
}