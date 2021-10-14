package N13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
			
		Generadora gen = new Generadora(); // necesitamos un elemento Generadora para poder acceder al método next().
		
		ArrayList<String> listaArrayList = new ArrayList<String>(); // añade / elimina elementos de forma dinámica
		for (int i=0; i<99;i++) {
			listaArrayList.add(gen.next());
		}
		
		HashSet<String> listaHashSet = new HashSet<String>(); // no permite duplicados. no ordena, no da acceso aleatorio 
		for (int i=0; i<99;i++) {
			listaHashSet.add(gen.next());
		}
		
		TreeSet<String> listaTreehSet = new TreeSet<String>(); // ordena por defecto los elementos de forma alfabética 
		for (int i=0; i<99;i++) {
			listaTreehSet.add(gen.next());
		}
		
		LinkedList<String> listaLinked = new LinkedList<String>(); // no entiendo su utilidad
		for (int i=0; i<99;i++) {
			listaLinked.add(gen.next());
		}
		
		LinkedHashSet<String> listaLinkedHashSet= new LinkedHashSet<String>(); //ordena por orden entrada, facil de acceder, malo para agregar 
		for (int i=0; i<99;i++) {
			listaLinkedHashSet.add(gen.next());
		}
		
	} 

}
