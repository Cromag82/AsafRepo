package Ex6;
 

public class Amphibian {
	
	public static void main (String[] args)  {
		
		Amphibian rana = new Frog();
				
		rana.croar();
		rana.nadar();
		rana.saltar();
		
	}	
	
	public void croar() {
			System.out.println( "Croac");	
	}
		
	public void saltar() {
		System.out.println( "Opala");	
	}
		
	public void nadar() {
		System.out.println( "Me voy");	
	}
		

}	

