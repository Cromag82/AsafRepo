package N2;

public class N2constructor {
	
	private String nombre;
	
	N2constructor(String nombre, int edad) { 
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	private int edad;
	
	
}
