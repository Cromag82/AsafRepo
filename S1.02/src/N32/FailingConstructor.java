package N32;

public class FailingConstructor {

	private String string;
	private int integer;
	private Disposer disposer;
	
	public FailingConstructor() throws Excep {
		this.string = string;
		this.integer = integer;
//		this.disposer = disposer;
		throw new Excep("excepcion");
		
	}

}

class Excep extends Exception {
	
	public Excep(String excep) {
		super("excep");
	}
}

class Disposer {
	
	public void dispose() {
	
	}
	
	
}
