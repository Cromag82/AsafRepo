package N14;

public class N14 extends Exception{
	
	private String string;
	
	public N14(String string) {
		this.string = string;
		
	}
	
	public String verString() {
		return string;
	}
}
