
package N3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.NoSuchElementException;

import javax.crypto.Cipher;
import javax.crypto.CipherSpi;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.*;
import java.util.Base64;
import javax.swing.*;


public class N3 {
	
	  static SecretKey llave;
	    private int tamanoLlave = 128; //puede ser de 128, 192 o 256
	    //private int T_LEN = 128; // importante para la salida desencriptada
	    private static Cipher encriptador; 

	    //crear llave
	    public void init() throws Exception { //crearemos una lleve con este metodo
	        KeyGenerator generator = KeyGenerator.getInstance("AES");
	        generator.init(tamanoLlave); //Tamaño de la llave
	        llave = generator.generateKey();
	    }
	  
	    //crear metodo encriptador
	    public static byte[] encriptador(String mensaje) throws Exception, NoSuchPaddingException {
	        byte[] mensajeByte = mensaje.getBytes();
	        encriptador = Cipher.getInstance("AES");
	        encriptador.init(Cipher.ENCRYPT_MODE, llave);
	        return encriptador.doFinal(mensajeByte);
	        
	        
	    }

	    //crear metodo desencriptador
	    public static byte[] desencriptador(byte[] mensajeEncriptado) throws Exception{
	        byte[] byteEncriptado = mensajeEncriptado;
	        Cipher cipherdecriptador = Cipher.getInstance("AES");
	        //GCMParameterSpec spec = new GCMParameterSpec(T_LEN,encriptador.getIV()); //importante añadirle el tamaño de la salida con el SPEC
	        cipherdecriptador.init(Cipher.DECRYPT_MODE,llave);
	        return cipherdecriptador.doFinal(byteEncriptado);
	        
	    }

	  	    
	    public static void main(String[] args) {
	    	  
	    	try {
	              N3 cripto = new N3();
	              cripto.init();
	              byte[] mensajeEncriptado = cripto.encriptador("Dame más joder!!!");
	              byte[] mensajeDesencriptado = cripto.desencriptador(mensajeEncriptado);
	              System.out.println(mensajeEncriptado);
	              System.out.println(mensajeDesencriptado);
	          }catch (Exception e) {
	              System.out.println(e);
	    }
	
	    }
	
	
	
	
	/*
	public static void main(String[] args ) throws FileNotFoundException {
	
		N3 main = new N3();
		String archivo = "propiedades.properties";
		FileInputStream archivoF = new FileInputStream(new File(archivo));
		String encriptado = main.encriptador("Hola"); 
		JOptionPane.showMessageDialog(null,encriptado);
		JOptionPane.showMessageDialog(null, main.desencriptador(encriptado));
		
	}
	
	static String LLAVE = "Prueba";
    
	//crear clave de encriptación
	public 	static SecretKeySpec crearClave(String clave) {
   
    	try {
    	byte [] cadena = clave.getBytes("UTF-8"); //se crea array de byts para convertir el string dado en argumento
    	MessageDigest md = MessageDigest.getInstance("SHA-256"); //se crea un "digestor"
    	cadena = md.digest(cadena); //se digiera el array de bits
    	cadena = Arrays.copyOf(cadena, 192/8); // se coloca un valor de bytes fijo al array
    	SecretKeySpec sc = new SecretKeySpec(cadena,"AES"); //este es el valor que retorna al generador
    	return sc;
    	}
    	catch (Exception e) {
    		return null;
    	}
    	
    	
    }
	//metodo para encriptar 
	public 	static String encriptador(String encriptar) { 
		
		try {
			SecretKeySpec secret =  crearClave(LLAVE); //
			Cipher cifrador = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cifrador.init(Cipher.ENCRYPT_MODE, secret);
			
			byte[] cadena = encriptar.getBytes("UTF-8");
			byte[] cadenaEncriptada = cifrador.doFinal(cadena);
			String cadenaEnc = new String(cadenaEncriptada);
			//byte[] cadena_encriptada = Base64.getEncoder().encode(secret.getEncoded()); //con esto puedo pasarlo a String
			return cadenaEnc;
			
		} 
		catch (Exception e) {
			return e.getMessage();
    		
    	}
		
		
		}
	//desencriptación

		public static String desencriptador(String desencriptar) { 
			
			try {
				SecretKeySpec secret =  crearClave(LLAVE); //
				Cipher cifrador = Cipher.getInstance("AES/ECB/PKCS5Padding");
				cifrador.init(Cipher.DECRYPT_MODE, secret);
				
				byte[] cadena = desencriptar.getBytes("UTF-8");
				byte[] cadenaDesncriptada = cifrador.doFinal(cadena);
				String cadena_des = new String(cadenaDesncriptada); 
			//	byte[] cadena_encriptada = Base64.getEncoder().encode(secret.getEncoded()); //con esto puedo pasarlo a String
				return cadena_des;
				
			} 
			catch (Exception e) {
				
	    		return null;
		
			} 
		}
*/		
	}
	

    

