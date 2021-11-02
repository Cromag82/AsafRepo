package N2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class N2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> matriz = Arrays.asList("uno1.0","dos2","trestrestres333","Cuatro4","5");
		
		//a)
		List<String> matriza = (List<String>) matriz.stream()
				.sorted(Comparator.comparing(l -> l.length()))
				.collect(Collectors.toList());
		System.out.println("Elementos ordenados de menor a mayor numero de caracteres: " +matriza);
			
		//b)
		List<String> matrizb = matriz.stream()
				.sorted(Comparator.comparingInt(String::length).reversed())
				.collect(Collectors.toList());
		System.out.println("Elementos ordenados de mayor a menor numero de caracteres: " +matrizb);
		
		//c)
		List<String> matrizc = matriz.stream()
				.sorted(Comparator.comparingInt(c -> c.charAt(0)))
				.collect(Collectors.toList());
		System.out.println("Elementos ordenados alfabeticamente por el primer caracter: " +matrizc);
	
		//d
		List<String> matrizd = matriz.stream()
				.sorted(Comparator.comparing(c -> c.length())) //se ordenan por tamaño primero
				.sorted(Comparator.comparing(c -> !c.contains("e"))) //se ordenan por distintos a contener "e" después
				.collect(Collectors.toList());
		System.out.println("Elementos que contienen la e primero: " +matrizd);
		
		//e
		List<String> matrize = matriz.stream()
				.map(e -> e.replace("a", "4"))
				.collect(Collectors.toList());
		System.out.println("Elementos cambiando la a por un 4: " +matrize);
		
		//f
		List<String> matrizf = matriz.stream()
				.filter(f -> f.matches("[0-9]"+""))
				.collect(Collectors.toList());
		System.out.println("Solo numéricos: " +matrizf);
		
		//g
		System.out.println(mates("suma",2,2));
		
	}
		public static float mates (String a,float b, float c) {
			
		Operacion nuevo = null;
		if (a.equals("suma")) {
			nuevo = () -> b + c;
		}
		else if (a.equals("resta")) {
			nuevo = () -> b - c;
		}
		else if (a.equals("multi")) {
			nuevo = () -> b * c;
		}
		else if (a.equals("division")) {
			nuevo = () -> b / c;
		}else 
			System.out.print("Opción incorrecta");
		

		return nuevo.operacio();
		}
		
	}


