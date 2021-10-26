package N2;

public class N2IntMain implements N2Int1,N2Int2   {
	
	public <T extends N2Int1> void metodo1(T t) {
		
	}
	
	public <T extends N2Int2> void metodo2(T t) {
		
	}


	public static void main (String[] args) {
		
		N2IntMain nuevo = new N2IntMain();
		nuevo.metodo1(nuevo);
		nuevo.metodo2(new N2IntMain());
		
		
	}

}