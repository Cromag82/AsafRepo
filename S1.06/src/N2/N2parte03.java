package N2;

public class N2parte03{
	
	public static <T extends N2parte01> void llamada(T t) { //extiendo una clase gen�rica y un tipo de 
		t.c();										 // objeto gen�rico
		t.f();
		t.g();
	}

}
