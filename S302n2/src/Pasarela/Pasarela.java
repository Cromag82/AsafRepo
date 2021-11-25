package Pasarela;



import FormaDePago.AdeudoCuenta;
import FormaDePago.FormaDePago;
import FormaDePago.Paypal;
import FormaDePago.Tarjeta;
import Interfaz.Callback;


public class Pasarela implements Callback {
	

	private AdeudoCuenta ac;
	private Paypal pp;
	private Tarjeta tj;
	private FormaDePago fdp;
	
	
	public Pasarela(FormaDePago a) {
		this.fdp = new FormaDePago(1);
		this.fdp = new FormaDePago(2);
		this.fdp = new FormaDePago(3);
	
	}

	
	public void pagar() {
		fdp.notificar(); //correcto
			if (fdp!=null) {		
				System.out.println("Procesando pago....");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			System.out.println("Cobrado");
			
			}
			else {
				System.out.println("No hay ningún método de pago introducido"); }
			}
	
		

	//crear metodo en el background que llamará a la pasarela

	@Override
	public void notificar() {
		
	
	
	}
}
		
	

