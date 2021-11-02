package N1Ex1i2;

public class Padre {
	
	protected String nombre;
	protected String apellido;
	protected int capital = 30000;
	
	public Padre (String nombre, String apellido, int capital) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.capital = capital;
		
	}

	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void comprarCoche() {
		this.capital -= 10000;
		
	}
	
	public void venderCoche() {
		this.capital += 10000;
		
	
	}
	

}
	


