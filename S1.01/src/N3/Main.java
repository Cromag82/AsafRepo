package N3;

public class Main {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heredera hr = new Heredera(); 
		Base gen = (Base)hr; //generalización: hacemos nuevo objeto tipo padre y le damos el valor de objeto hijo
		gen.metodo1(); // de esta forma, tenemos un objeto de tipo padre que ejecuta el metodo del hijo (con el método sustituido previamente)
		
	}

}
