package Main;

import java.util.Scanner;

import FormaDePago.AdeudoCuenta;
import FormaDePago.FormaDePago;
import FormaDePago.Paypal;
import FormaDePago.Tarjeta;
import Pasarela.Pasarela;
import Tienda.Tienda;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Tienda tienda = new Tienda("Zapateria");
				
		System.out.println("Como desea pagar?\n 1.Tarjeta\n 2.Paypal\n 3.Adeudo Bancario\n");
		
		Scanner entrada = new Scanner(System.in);
		int opcion = entrada.nextInt();
		
		FormaDePago fdp = new FormaDePago(opcion);
		//fdp.notificar(); //correcto
		
		Pasarela p1 = new Pasarela(fdp);
			
			if ((opcion==1) || (opcion==2) || (opcion==3)) {
				p1.pagar();
				} 
			else {
				System.out.println("Método de pago erróneo"); //correcto
			}
		
			entrada.close();
					
		tienda.notificar();
		
	}

}
