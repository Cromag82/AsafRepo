package N1Ex1i2;

public class Hijo1 extends Padre {



	public Hijo1(String nombre, String apellido, int capital) {
		super(nombre,apellido,capital);
	
	}

	@Override
	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String getApellido() {
		return apellido;
	}
	
	@Deprecated
	public void setApellido(String apellido) {
		
	}
	
	@Override
	public void comprarCoche() {
		this.capital -= 5000;
		
}	
	@Override
	public void venderCoche() {
		this.capital += 5000;
	}
	
	
}


