//Escriba un etodo que utilitzi un iterador per a rec�rrer una col�lecci� i imprimeixi el resultat de toString() per a cada objecte 
//del Contenidor. Empleni tots els diferents tipus de Java Collections amb una s�rie d'objectes i aplicaci� el m�tode que hagi dissenyat 
//a cada Contenidor.

package N14;

public class N14 implements Comparable<N14> {

	
	private String este;

	public N14(String este) {
		this.este = este;
	}

	@Override
	public String toString() {
		return "N14 [este=" + este + "]";
	}

	@Override
	public int compareTo(N14 o) {
		// TODO Auto-generated method stub
		return this.este.compareTo(o.este);
	}
	
	
	
}

