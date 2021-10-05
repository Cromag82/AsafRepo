package N32;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Excep {
		
		try {
			FailingConstructor nuevo = new FailingConstructor();
			
		}
		catch (RuntimeException uno){
			System.out.println(uno.getMessage());
		}
	}	

}
