package N21;

import java.util.Arrays;

public class Tricycle extends Cycle {

	public Tricycle() {
		super(3);
		
	}
	public void ride() {
		super.ride();
		System.out.println("Ride de Tricycle. Tienes " + wheels() + " ruedas.");
		
	}
	
}
	

