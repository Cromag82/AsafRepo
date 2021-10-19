package org.itacademy.javatesting.assertj;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class TestMainClass {
	@Test
	void exercici1() {
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
}
