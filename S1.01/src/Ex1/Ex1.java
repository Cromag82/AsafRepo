package Ex1;

import java.util.Scanner;
	
public class Ex1 {
	private String nombre, apellido; 
	
	public Ex1(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
	public Ex1() {
		
	}

	public static void main (String [] args) {
		new Ex1().introduceNombre();	
	}
	
	public void introduceNombre(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre = entrada.nextLine() + " ";
		System.out.println("Introduce tu apellido: ");
		String apellido = entrada.nextLine();
		Ex1 nombreApellido = new Ex1(nombre,apellido);
		
		System.out.println("Te llamas " + nombre + apellido);
		
	}

}
