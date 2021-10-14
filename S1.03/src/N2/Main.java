package N2;

import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<N2> cola = new PriorityQueue(); 
		
		N2 num1 = new N2();
		N2 num2 = new N2();
		N2 num3 = new N2();
		N2 num4 = new N2();
		N2 num5 = new N2();

		
		cola.add(num1);
			cola.add(num2);
				cola.add(num3);
					cola.add(num4);
					cola.add(num5);
					
		System.out.println(cola);
	
				
		for (int i=0; i<=cola.size();i++) { //por qué no le da 5 vueltas al bucle? 
			cola.poll();
			System.out.println(cola);
			
		}
		
		

		

		
		
						
		
	}

}
