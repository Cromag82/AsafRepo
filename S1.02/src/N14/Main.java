package N14;

public class Main{

	public static void main(String[] args) {
	
		
	try {
		throw new N14("mi excepcion");
		
	}
	catch (N14 e){
		System.out.println("una excepcion: " + e.verString()); 
	
		
	}

	}	
}