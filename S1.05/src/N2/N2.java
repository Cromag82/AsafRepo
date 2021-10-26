package N2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

public class N2 {

	public static void main(String[] args ) throws IOException {
		
		Properties prop = new Properties(); 
		
		try {
			prop.load(new FileInputStream(new File("propiedades.properties")));
				System.out.println(prop.get("CLAVE"));
				System.out.println(prop.get("USUARIO"));
				System.out.println(prop.get("DRIVER"));
				System.out.println(prop.get("URL"));

		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch (IOException e) {
			System.out.println(e.getMessage());

			
		}
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	}
		


