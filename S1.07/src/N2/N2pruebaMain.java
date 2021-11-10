package N2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import com.google.gson.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class N2pruebaMain implements Serializable {
	
	@SuppressWarnings("unchecked")
	public static void main (String[] args)  {
		
		//asi empìezo un fichero json, no es la intención
		@Wrapper(wrapper = "")
		JsonElement nombre = null,apellido = null;
		
		JsonObject objeto = new JsonObject();
		objeto.add("nombre",nombre);
		objeto.add("apellido",apellido);
		
				
		/*
		try (FileWriter archivo = new FileWriter("archivo.json")){
			archivo.write(persona.toString());
			archivo.flush();
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(objeto); */
}
	
}