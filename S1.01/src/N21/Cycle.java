package N21;
import java.util.Arrays;
import java.util.Scanner;

public class Cycle {

	protected int numRodes; 
	
	
	public Cycle(int numRodes) {
		this.numRodes = numRodes;
	}
	
	
	public void ride() {
		System.out.print("Vas Volando!");
		System.out.println("El numero de ruedas de tu ciclo es " + wheels());
				

	}
	
	public int wheels() {
		return numRodes;
			
		}
		
		}
	

