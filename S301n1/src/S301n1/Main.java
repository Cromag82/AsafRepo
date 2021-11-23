package S301n1;

import Singleton.Undo;

public class Main {

	public static void main(String[] args) {
		
		Undo c = Undo.getInstance(); 
		c.listCommando();
		c.addCommando();
		c.eraseCommando();
		c.updateCommando();
				
			}
}
