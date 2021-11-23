package Singleton;

import java.util.ArrayList;

public class Undo {
	private ArrayList<String> commandos = new ArrayList<String>();
	private static Undo c = null;

	private Undo() {
					
	}
	
	public static Undo getInstance() {
		if (c == null) {
			Undo c = new Undo();
		}
		return c;
	}
	
	public void addCommando() {
		commandos.add(null);
		System.out.println("Añadido el commando");
	}
	public void eraseCommando() {
		commandos.remove(null);
		System.out.println("Borrado el commando");
	}
	public void updateCommando() {
		commandos.add(null);
		System.out.println("Actualizado el commando");
	}
	public void listCommando() {
		for (String i:commandos) {
			System.out.println(i);
		}
	}
	
	
	public Undo getC() {
		return c;
	}

	public void setC(Undo c) {
		this.c = c;
	}
	
	
}
