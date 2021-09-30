package Ex5;

public class Ex5 {
	
	
	
	public void metodeSobrecarregat() {
		System.out.println("Override baby!");
	
	}
	
	public void metodeSobrecarregat(String pepe) {
		System.out.println("Override baby!");
	
	}
	
	public void metodeSobrecarregat(int jose) {
		System.out.println("Override baby!");
	
	}
	
	public static void main(String[] args) {
		MetodeSobrecarregat ms = new MetodeSobrecarregat();
		ms.metodeSobrecarregat();
		ms.metodeSobrecarregat(0);
		ms.metodeSobrecarregat(0);
		ms.metodeSobrecarregat("Pepe");
	}
}

