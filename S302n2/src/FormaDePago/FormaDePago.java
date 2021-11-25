package FormaDePago;

import Interfaz.Callback;

public class FormaDePago implements Callback {
	
	private AdeudoCuenta ac;
	private Paypal pp;
	private Tarjeta tj;
	
	
	public FormaDePago(int opcion) {
				
		switch (opcion)  {
			case 1: 
			{
				tj = new Tarjeta("A",1);
				pp=null;
				ac=null;
				break;
			}
			case 2: 
			{
				pp = new Paypal("A",1);
				tj=null;
				ac=null;
				break;
			}
			case 3: {
				ac = new AdeudoCuenta("A",1);
				pp=null;
				tj=null;
				break;
			}
			default: 
				pp=null;
				ac=null;
				tj=null;
				break;
		}
		

	}


	@Override
	public void notificar() {
		if ((pp==null) && (tj==null) && (ac==null)) {
		System.out.println("Seleccion incorrecta");
		}
		else {
			System.out.println("Modo de pago seleccionado correctamente");
		}
		}
		
	
	
	
	
}
