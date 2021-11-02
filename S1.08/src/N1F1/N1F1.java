package N1F1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class N1F1 {
	
	public static void main(String[] args) {
		//ejercicio 1
		ArrayList<String> nombres = new ArrayList<String>(); 
			nombres.add("Alx");
			nombres.add("Pepe");
			nombres.add("Sonia");
			nombres.add("Cristian");
			nombres.add("Mar");
			nombres.add("Baudilio");
		
		System.out.println(retornadorAy3(nombres));
	
		//ejercicio 2
		ArrayList<Integer> nums = new ArrayList<Integer> (); 
		nums.add(0);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		
		System.out.println(numParImpar(nums));
		
		//ejercicio 3
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Uno");
		lista.add("Dos");
		lista.add("Tres");
		lista.add("Cuatro");
		
		System.out.println(retornadorO(lista));
		
		//ejercicio4
		System.out.println(devuelvemasde5(lista));
		
		//ejercicio5
		String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto",
				"septiembre","octubre","noviembre","diciembre"};
		Arrays.stream(meses).forEach(m -> System.out.print(m + " "));
		
		//ejercicio6
		imprimirMeses(meses);
		
		
	}
	//ejercicio 1
	public static ArrayList<String> retornadorAy3(ArrayList<String> e) { //introducir el AL 
		ArrayList<String> retornador = (ArrayList<String>) e.stream() //activar el stream del AL
				.filter(n -> n.startsWith("A") && n.length() == 3) //usar filtro, como si fuera una unidad del forEach (Ejemplo: for (n:e)
				.collect(Collectors.toList()); //collect es el metodo recopilador de n
		return retornador; 
	}
	
	//ejercicio 2
	public static String numParImpar(ArrayList<Integer> e) {
		String retornadorPar = e.stream()
				.filter(i -> i%2 == 0).map(i -> "e" + i)
				.collect(Collectors.joining(","));
		String retornadorImpar = e.stream()
				.filter(i -> i%2 != 0).map(i -> "o" + i)
				.collect(Collectors.joining(","));
		
		return retornadorPar + "," + retornadorImpar; 
	}
	//ejercicio 3
	public static List<String> retornadorO(List<String> e) {
		return e.stream()
				.filter( s-> s.contains("o") || (s.contains("O")))
				.collect((Collectors.toList()));				
		

	}
	//ejercicio4
	public static List<String> devuelvemasde5(List<String> e) {
	return e.stream()
			.filter( s-> (s.length()>5))
			.collect((Collectors.toList()));
	
	}
	//ejercicio6
	public static void imprimirMeses(String[] e) {
		Arrays.stream(e).forEach(m -> System.out.println(m + " "));
}

}	
