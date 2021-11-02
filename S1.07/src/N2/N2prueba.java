package N2;

public class N2prueba {
	
	private String nombre;
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
	
	N2prueba(String nombre, int edad) { 
		this.nombre = nombre;
		this.edad = edad;
		
	}
}
