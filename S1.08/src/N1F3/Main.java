package N1F3;

public class Main {

	public static void main(String[] args) {
	
	
	N1F3 funcionalidadInvertida = (e) -> 
	{
	String invertido=null;
	for(int i = e.length()-1;i>=0;i--) {
		invertido = invertido + e.charAt(i);
		
	}
	return invertido;
	};	
	
	System.out.print(funcionalidadInvertida.reverse("Quetepasachaval"));
	
	}
	

}


