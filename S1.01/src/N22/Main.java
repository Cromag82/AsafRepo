package N22;

public class Main {


	public static void main(String[] args) {
		
		Roedor [] roedores = new Roedor[9];
		
		
		/*  ESTA FORMA TAMBIEN ES VALIDA
		
		Raton r1 = new Raton();
		Jerbo j1 = new Jerbo();
		Hamster h1 = new Hamster();
		
		roedores[0] = r1;
		roedores[1] = j1;
		roedores[2] = h1;
		
		*/
		
		roedores[0] = new Raton();
		roedores[1] = new Jerbo();
		roedores[2] = new Hamster();
		
				
		((Roedor)roedores[0]).comer();
		((Roedor)roedores[1]).olisquear();
		((Roedor)roedores[2]).correr();
		
		for(Roedor roedor:roedores) {
			roedor.comer();
			roedor.correr();
			roedor.olisquear();
		}
		
	}

}
