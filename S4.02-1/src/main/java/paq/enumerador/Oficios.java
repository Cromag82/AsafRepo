package paq.enumerador;

public enum Oficios {
	
	SOLDADOR("SOLDADOR"), PROGRAMADOR("PROGRAMADOR"),ENCOFRADOR("ENCOFRADOR"),BIBLIOTECARIO("BIBLIOTECARIO");
	
	private String feina;
	
	
	private Oficios(String feina) {
		this.feina = feina;
		
	}
	
	public String getFeina() {
		return feina;
	}


	public void setFeina(String feina) {
		this.feina = feina;
	}


}