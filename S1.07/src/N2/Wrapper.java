package N2;

import java.io.FileInputStream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.annotation.Retention;


public @interface Wrapper { //anotación propia
	
	String wrapper() default ""; //necesitará siempre un valor como mínimo


	class envoltorio {
	
	public static void main(String[] args)  {
				
				/*ObjectMapper objectMapper = new ObjectMapper();
				Wrapper1 objeto = new Wrapper1("Objeto");
				String jsonString = objectMapper.writeValueAsString(objeto);
				FileOutputStream archivo = new FileOutputStream ("archivo.json");
				ObjectOutputStream sos = new ObjectOutputStream(archivo);
				sos.writeObject(objeto);
				sos.close();
			    System.out.println(jsonString);
		*/		
				String introduceNombre = null,nombre = null,introduceApellido = null,apellido = null;
				
				JSONWrappedObject objeto = new JSONWrappedObject();
				objeto.put(introduceNombre,nombre);
				objeto.put(introduceApellido,apellido);
				
				JSONObject persona = new JSONObject();
				persona.put("nombre completo", objeto);
				
				try (FileWriter archivo = new FileWriter("archivo.json")){
					archivo.write(persona.toString());
					archivo.close();
					
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				
				
			}
		
}		
	
}
			
	

