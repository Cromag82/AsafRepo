package N3;

import java.util.List;

public class N3 <T> {

	public static class Holder<T> {
		T obj1;
		
		public void caja(Holder<List<?>> t) {
			t.equals(obj1); //le podemos dar metodos tanto de List como del genérico
			
			
		}
		
		public void caja2(List<Holder<?>> t) {
			t.add(0,null); //le podemos dar metodos tanto de List como del genérico
			
			
		}
		
	}
}
