package N1Ex5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class N1Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] pepe = {1,2,3}; //creo un valor para extrear datos
		int[] jose = null;
	
		
		try { 
			String archivo = "pruebaSerializable.txt"; //creo un archivo que recogera datos
			FileOutputStream file = new FileOutputStream(archivo);
			ObjectOutputStream f = new ObjectOutputStream(file);
			f.writeObject(pepe); 
			f.close();
			
			} 
		catch (Exception e) {
			e.getMessage();
		}
		
		
		try {
			String archivo = "pruebaSerializable.txt"; //recojo el archivo en la raiz
			FileInputStream arch = new FileInputStream(archivo) ;
			ObjectInputStream arc = new ObjectInputStream(arch) ;
			
			jose = (int[]) arc.readObject(); //cogemos los datos del archivo y se lo a�adimos a la nueva variable
			arc.close();
			arch.close();
			
			System.out.println(Arrays.toString(jose));
				

		}
		catch (Exception e) {
			e.getMessage();
		}
		
	}

}
