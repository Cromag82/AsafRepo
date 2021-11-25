package Tienda;

import javax.security.auth.callback.Callback;

import FormaDePago.AdeudoCuenta;
import FormaDePago.Paypal;
import FormaDePago.Tarjeta;


public class Tienda implements Callback{
	//llamador
	
	private String nombreTienda;
	
	
				
	public Tienda(String nombreTienda) {

		this.nombreTienda = nombreTienda;
	}

	public void notificar() {
		System.out.println("Gracias por comprar en nuestra tienda");

		
	}
	
	public void llamadaTienda() {
		nombreTienda.notify();
	}
	
	
	
}
