package N21;

public class N21 {

	public void f() throws Exception2 {
			try {
				g();
			}
			catch (Exception1 e) {
				throw new Exception2("Dos");
			
			}
			
	}
	
	public void g() throws RuntimeException, Exception1 {
		throw new Exception1("Uno");
	}
	
}

class Exception1 extends Exception{
	
	public Exception1(String uno) {
		super("Uno");
	}
	
}
class Exception2 extends Exception{

	public Exception2(String dos) {
		super("Dos");
	}
	
}


