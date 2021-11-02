package N1Ex1i2;

public class Main {

	@SuppressWarnings("deprecation") //añadimos los supress warnings del setApellido
	public static void main(String[] args) {
		
		Hijo1 Pepe = new Hijo1("Pepe","Lamarca",20000);
		Hijo2 Manolo = new Hijo2("Manolo","Lamarca",20000);
		
		Pepe.setApellido(null);
		Manolo.setApellido(null);
		Pepe.comprarCoche();
		Manolo.venderCoche();
				
		System.out.println(Pepe.getCapital());
		System.out.println(Manolo.getCapital());
		
		
	}
	
	
	

}
