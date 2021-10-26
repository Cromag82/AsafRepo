
package N1Ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.nio.Buffer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class N1Ex1 {
	
	static StringBuffer sb = new StringBuffer();

	public static void main(String[] args ) throws Exception {
		//llamada a ejercicio 2 con recursivo
		
		buscarEnDirectorio(new File("C:/xampp/htdocs"));
		FileWriter fw = new FileWriter(new File("c:/Users/formacio/texto.txt"));
		fw.append(sb.toString());
		fw.close();
		
		//llamada a ejercicio 4
		leerArchivo("c:/Users/formacio/texto.txt");
		
		
		
		/*
		//ejercicio 1
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce un directorio: ");
		String entrada = lector.next();
		
		File[] listado = new File(entrada).listFiles();
				
		
		for (File elemento:listado) {
			System.out.println(elemento);
		*/
				
			
		//ejercicio 2 sin recursivo
		/*
		if (listado == null || listado.length == 0) {
		    System.out.println("No hay elementos dentro de la carpeta actual");
		}
		else {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		    	for (int i=0; i< listado.length; i++) {
		            File listado1 = listado[i];
		            System.out.printf(String.format("%s (%s) - %d - %s"),
		            		listado1.getName(),
		            		listado1.isDirectory() ? "Directorio" : "Fichero");
		            		sdf.format(listado1.lastModified());
		    	}
			*/
		
			}
		
		
		
		
		
	
	
	
	//ejercicio 2 con recursivo
	public static void buscarEnDirectorio(File directorio) throws Exception {
		sb.append("D" + directorio+"\n");
		System.out.println("D " + directorio);
        File[] listado = directorio.listFiles();
             
        
        if (listado!=null) {
            for(File file:listado) {
                if (file.isDirectory()) {
                    buscarEnDirectorio(file); 
                    
                	}
                else {
                    System.out.println("F "+file + new Date(file.lastModified()));
                    sb.append("A " + file + "\n"); // ejercicio 3
                    
                    
                }
            }
        }
        else {
            System.out.println("A "+directorio + new Date(directorio.lastModified()));
            sb.append("D " + directorio + "\n"); // ejercicio 3
         
             }
    }
	
	//ejercicio 4. Se añade excepciones por si no encuentra el archivo nombrado
	public static void leerArchivo(String archivo) throws FileNotFoundException, IOException {
		FileReader lector = new FileReader(archivo); //creamos lector
		BufferedReader b = new BufferedReader(lector); //creamos buffer del lector
		String nuevo; //creamos almacenador
		while ((nuevo = b.readLine())!=null) { //rellenamos el almacenador con el buferador
			System.out.println(nuevo); //imprimimos por consola el contenido del almacenador 
		}
		b.close(); //cerramos buferador
		
	}

	

}






