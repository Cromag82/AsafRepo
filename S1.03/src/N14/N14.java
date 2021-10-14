//Escriba un etodo que utilitzi un iterador per a recórrer una col·lecció i imprimeixi el resultat de toString() per a cada objecte 
//del Contenidor. Empleni tots els diferents tipus de Java Collections amb una sèrie d'objectes i aplicació el mètode que hagi dissenyat 
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

