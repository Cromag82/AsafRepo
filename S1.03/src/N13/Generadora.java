package N13;

import java.util.Arrays;
import java.util.Scanner;
//Exercici 3. Creu una classe generadora que retorni noms de personatges (com String) de la seva pel·lícula favorita 
//cada que vegada que invoqui next(), i que torni al principi de la llista de personatges una vegada que hagi acabat
//amb tots els noms. Utilitzi aquest generador per a emplenar una matriu, un ArrayList, un LinkedList, un HashSet, un LinkedHashSet 
//i un TreeSet, i després imprimeixi per pantalla cada contenidor.
public class Generadora {

	String personaje;
	String[] lista  = {"Pepe","Musta","Asaf"};
	int index; 
	
	//GENERAMOS UNA LISTA 
	
	public Generadora() {
				
	}
	
	public String next() {
		int temp = index; 
		index = index + 1; // suma unidad
		index = index%lista.length; // cuando llega al final de la lista, vuelve al principio;
		return lista[index];
		// Aqui estamos generando un bucle infinito!!!! 
		
			 
	}

}
	 