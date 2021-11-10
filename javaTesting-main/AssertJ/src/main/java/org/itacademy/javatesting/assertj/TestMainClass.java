package org.itacademy.javatesting.assertj;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import org.junit.jupiter.api.Test;



public class TestMainClass {
/*	@Test
	void exercici() {
	    assertThat(6).isNotEqualTo(7);
	}

  @Test
  void a_few_simple_assertions() {
    assertThat("The Lord of the Rings").isNotNull()   
                                       .startsWith("The") 
                                       .contains("Lord") 
                                       .endsWith("Rings"); 
  }
 
  @Test
  void a_test(){
		assertThat("frodo")
		  .isNotEqualTo("sauron");
		//  .isIn("frodo jodo sauron somo");
  }
  @Test
  void a_test2(){
		assertThat("Frodo")
		  .startsWith("Fro")
		  .endsWith("do");
		//  .isEqualToIgnoringCase("frodo");
  }
  @Test
  void a_test3(){
		assertThat("frodosam")
		  .hasSize(8)
		  .contains("frodo", "sam")
		  .doesNotContain("sauron");
	}
*/
	
@Test 
void exercici1() {
    assertThat(6).isNotEqualTo(7);
}
//Exercici 2. Una asserció que demostri que la referència a un objecte és la mateixa que una altra, i una altra que indiqui que és diferent.
@Test
void exercici2() {
    assertThat("Isabel").isEqualTo("Isabel");
    assertThat("Isa").isNotEqualTo("Isabel");
    
}

//Exercici 3. Una asserció que indiqui que dues arrays d'enters són idèntics.
@Test
void exercici3() {
    int pepe[]= {1,2,3};
    int jose[]= {1,2,3};
    assertThat(pepe).isEqualTo(jose);
}

//Exercici 4. Creu un array list contenidor de diversos tipus d'objectes (creu-los també). 
//Escrigui una asserció per a verificar l'ordre dels objectes en el ArrayList segons van ser inserits.
//Ara verifiqui que la llista anterior conté els objectes en qualsevol ordre.
//Verifiqui que, en la llista anterior, un dels objectes s'ha afegit només una vegada. Deixi un dels elements sense afegir, i verifiqui no la llista no conté aquest últim.

@Test
void exercici4() { //aquí buscamos el fallo expresamente
    ArrayList<Integer> pepe= new ArrayList<Integer>();
    ArrayList<Integer> jose= new ArrayList<Integer>();
    pepe.add(1); pepe.add(3); pepe.add(2);
    jose.add(1); jose.add(2); jose.add(3);
    assertThat(pepe).isEqualTo(jose);
}

@Test
void exercici5() {
	HashMap<Integer,Integer> prueba = new HashMap<Integer,Integer>();
	prueba.put(1,1);
	assertThat(prueba).containsKey(1);
}

@Test
void exercici6() {
	int a[] = {1,2,3};
	try {
		System.out.println(a[2]); 
		}
	catch (ArrayIndexOutOfBoundsException b) {
		System.out.println("Te pasaste");
		assertThat(b).doesNotThrowAnyException(); //nos pasamos de Bounds y salta la excepción, nos dará un error en el JUnit al esperar excepción.
	}
}
@Test
void exercici7() {
	Optional<String> nuevo = Optional.empty();
	assertThat(nuevo).isEmpty();
	
	
}
	
	
	
}
