package N3;

public class Alumnes {

	String nom; 
	int edat; 
	String curs; 
	float nota;
	
	public Alumnes(String nom, int edat, String curs, float nota) {
		super();
		this.nom = nom;
		this.edat = edat;
		this.curs = curs;
		this.nota = nota;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public String getCurs() {
		return curs;
	}

	public void setCurs(String curs) {
		this.curs = curs;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alumnes [nom=" + nom + ", edat=" + edat + ", curs=" + curs + ", nota=" + nota + ", getNom()=" + getNom()
				+ ", getEdat()=" + getEdat() + ", getCurs()=" + getCurs() + ", getNota()=" + getNota() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
