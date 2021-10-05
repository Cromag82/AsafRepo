package N15;

import java.util.Scanner;

public class N15 {

	/*- EN ESTE EJERCICIO HAY QUE CREAR UN PROGRAMA QUE, 
	EN CASO DE NO DAR EL RESULTADO DEMANDADO POR LA ENTRADA,
	TIENE QUE SALTAR LA EXCEPCIÓN Y VOLVER A PEDIR. */
	
	public static void main(String[] args) {
		boolean continuar = true; // CONTROLADOR DE FINALIZACION
		Scanner entrada = new Scanner(System.in);
		while (continuar) {
			try {
				System.out.println("Introduce un numero: ");
				String datos = entrada.next();
				int cadena = Integer.parseInt(datos);
				// SI LA ENTRADA NO SE CONVIERTE EN INT,
				// SALTA LA EXCEPCION.
				
				System.out.println(cadena);
				
				continuar = false;				
				
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
