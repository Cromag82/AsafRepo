package FormaDePago;

public class AdeudoCuenta {

	private String nombreUsuario;
	private int cuenta;
	
	public AdeudoCuenta(String nombreUsuario, int cuenta) {
		
		this.nombreUsuario = nombreUsuario;
		this.cuenta = cuenta;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public int getCuenta() {
		return cuenta;
	}

	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}
	
	
}
