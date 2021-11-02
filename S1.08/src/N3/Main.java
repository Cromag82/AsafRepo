package N3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) {
		
		List<Alumnes> lista = new ArrayList<Alumnes>();
		
		lista.add(new Alumnes("Adrian",38,"Ciencias",4));
		lista.add(new Alumnes("Pepe",28,"Pintura",4));
		lista.add(new Alumnes("Lorena",24,"Java",7));
		lista.add(new Alumnes("Martin",65,"PHP",6));
		lista.add(new Alumnes("Hermes",25,"Neurología",(float) 7.4));
		lista.add(new Alumnes("Joaquina",35,"Moda",(float) 5.8));
		lista.add(new Alumnes("Leire",45,"Arquitectura",(float) 8.7));
		lista.add(new Alumnes("Pepe",31,"Java",(float) 4.8));
		lista.add(new Alumnes("Barbara",27,"Politica",(float) 8.9));
		lista.add(new Alumnes("Adrian",28,"Historia",(float) 6.8));
		
		System.out.println("----------------------Ejercicio 1----------------------");
		
		//ejercicio 1 //intiución cero... por que carajos usamos un flatMap?
		lista.stream().flatMap(l -> Stream.of("nombre:" + l.getNom() + ",edad:" + l.getEdat()))
					.collect(Collectors.toList())
					.forEach(System.out::println); 
		
		System.out.println("----------------------Ejercicio 2----------------------");
		//ejercicio 2
		List<Alumnes> listaA = lista.stream()
					.filter(l->l.getNom().startsWith("A"))
					.collect(Collectors.toList());
		System.out.println("Alumnos que empiezan por A: " + listaA);
		
		System.out.println("----------------------Ejercicio 3----------------------");
		//ejercicio 3
		lista.stream()
			.filter(l->l.getNota() >= 5)
			.forEach(System.out::println);
			
	//	System.out.println("Alumnos que tienen mas de 5: " + lista5oMas);
		
		System.out.println("----------------------Ejercicio 4----------------------");

		//ejercicio 4
		lista.stream()
				.filter(l->l.getNota() >= 5 && !l.getCurs().equalsIgnoreCase("PHP"))
				.forEach(System.out::println);
		
		System.out.println("----------------------Ejercicio 5----------------------");

		//ejercicio 5
		lista.stream()
		.filter(l->l.getEdat() >= 18 && l.getCurs().equalsIgnoreCase("JAVA"))
		.forEach(System.out::println);
		
		


	}
}
