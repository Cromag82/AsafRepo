package N11;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			String esta = "esta";
			throw new Exception(esta);
		}
		 
		catch (Exception e) {
			
			System.out.println(e.getMessage()); //EL MENSAJE CAPTURA EL STRING QUE LE DEMOS, EN ESTE CASO, esta ES UN STRING
		}
		
		finally {
			System.out.println( "pasaba por ahí.... "); //SE EJECURARÁ SIEMPRE
		}
		
		}
	}
