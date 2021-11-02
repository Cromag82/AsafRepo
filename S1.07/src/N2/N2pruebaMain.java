package N2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import org.json.simple.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class N2pruebaMain implements Serializable {
	
	@SuppressWarnings("unchecked")
	public static void main (String[] args) throws JsonProcessingException {
		
		@Wrapper(wrapper = "")
		JSONObject objeto = new JSONObject();
		objeto.put("nombre","Asaf");
		objeto.put("apellido","Laszewicki");
		
		JSONObject persona = new JSONObject();
		persona.put("nombre completo", objeto);
		
		try (FileWriter archivo = new FileWriter("archivo.json")){
			archivo.write(persona.toString());
			archivo.flush();
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(objeto);
}
	
}