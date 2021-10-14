package N3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class N3 {
	
	
	private String[] contenedor;
	private int[] contenedorInt;
	private int index = 0;
	
	public N3(int tamano) {
		this.contenedor = new String[tamano];
		this.index = index;
		this.contenedorInt = new int[tamano];
		
	}
	
	public void nuevoElemento(String palabra) {
		if(index >= contenedor.length) {
			contenedor = Arrays.copyOf(contenedor, index+1);
		}
		this.contenedor[index] = palabra;
		this.index = index+1;
	}
	
	public void nuevoElementoInt(int integer) {
		if(index >= contenedorInt.length) {
			contenedorInt = Arrays.copyOf(contenedorInt, index+1);
		}
		this.contenedorInt[index] = integer;
		this.index = index+1;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(contenedor);
		result = prime * result + Objects.hash(index);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		N3 other = (N3) obj;
		return Arrays.equals(contenedor, other.contenedor) && index == other.index;
	}
		
	}
	
	
	
	/*
	Scanner entrada = new Scanner(System.in);
	
	
		for (int i = 0; i<contenedor.length; i++) {
			System.out.println("Introduce el valor [" + i + "]" );
			contenedor[i] = entrada.nextLine(); 
	*/					
					
				
		
			
			
				
			
		
	
		
	
	
	
	
	

