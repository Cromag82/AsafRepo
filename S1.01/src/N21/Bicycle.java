package N21;

import java.util.Arrays;

public class Bicycle  extends Cycle {

	public Bicycle() {
		super(2);
	}
	
	public static void main(String[] args) {
		
		
	}
	public void ride() {
		super.ride();
		System.out.println("Ride de Bicycle. Tienes " + wheels() + " ruedas.");
	}
	
	public void balance()  {
		
	}


	
}
