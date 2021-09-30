package N21;

public class Main {

	public static void main(String[] args) {

		// crear nuevo objecto de cada hijo
		Unicycle uc = new Unicycle();
		Bicycle bc = new Bicycle();
		Tricycle tc = new Tricycle();

		// llamada de metodo desde cada objeto creado anteriormente
		uc.ride();
		bc.ride();
		tc.ride();
		
		//generalizar ??
		
		Cycle t1 = (Cycle)tc; //creamos nuevo objeto de tipo hijo a través desde el padre
		t1.ride();
				
		((Cycle)uc).ride(); 
		((Cycle)bc).ride();
		((Cycle)tc).ride();
		
		// matriz de tipo Cycle y añadir objetos
		
		Cycle[] matriz = new Cycle[3];
		matriz[0] = (Cycle)uc; //instanciados desde Cycle, tenemos los tres objetos distintos en la matriz
		matriz[1] = (Cycle)bc;
		matriz[2] = (Cycle)tc;
		
		// Especialización (ir al hijo específicamente)
		((Unicycle)matriz[0]).balance();
		((Bicycle)matriz[1]).balance();
		((Tricycle)matriz[2]).balance(); // de esta forma se ve que no tiene metodo balance esta clase
	}

}
