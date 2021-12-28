

package paq.controlador;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;




import paq.enumerador.Oficios;
import paq.modelo.Trabajador;
import paq.modelo.Usuario;
import paq.repositorio.BdTj;

import paq.servicio.Servicio;


	
	@Controller
	@RequestMapping("")
	public class Controlador implements Filter{
		
		BdTj bdtj = new BdTj();;
		
		@Autowired
		Servicio service;
		
		@Override
		public void init(FilterConfig filterConfig) throws ServletException {
		}

		@Override
		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
				throws IOException, ServletException {
			HttpServletResponse httpServletResponse = (HttpServletResponse) response;
			httpServletResponse.setHeader("IT-Academy-Exercise", "Simple Service");
			chain.doFilter(request, response);
		}

		@Override
		public void destroy() {
		}
				
		//directo al html, mirar carpeta resources/templates
		@GetMapping("/inicio")
		public String getLogin(Model model) {
			model.addAttribute("titulo", "ENTRÁ ACÁ");
			
			return "login";
					
		}
		
		@PostMapping("/inicio")
		public String login(Usuario usuario, Model model, 
						@RequestParam String nombre,
						@RequestParam String password) {
			if (usuario.getNombre().equals("Asaf") && usuario.getPassword().equals("punk")) {
				ArrayList<Trabajador> tj = bdtj.getBdtj();
				model.addAttribute("usuario", usuario);
				model.addAttribute("trabajadores", tj);
				return "consulta";
			} else
				return "login";
		}
			
		@PostMapping("/consulta")
		public String getConsulta() {
			return "consulta";
					
		}
		
		//1. Read
		@GetMapping("/trabajadores")
		public ArrayList<Trabajador> getListaTrabajadores() {
			return service.obtenerTrabajadores();
					
		}
		
		//2.Create
		@PostMapping("/trabajador")
		public Trabajador insertTrabajador(@RequestBody Trabajador trabajador) {
			return service.nuevoTrabajador(trabajador);
		
		}
		
		//3.Update
		@PutMapping("/trabajador")
		public Trabajador updateTrabajador(@RequestBody Trabajador trabajador) {
			return service.updateTrabajador(trabajador);
		
		} 
		
		//4.Delete
		@DeleteMapping("/trabajador")
		public String deleteTrabajador(@RequestBody Trabajador trabajador) {
			return service.deleteTrabajador(trabajador);
		
		}
		
		//Crea una petició HTTP especial que busqui empleats per feina
		//2.1.Buscar por feina
		@GetMapping("/perfeina")
		public ArrayList<Trabajador> getListaPorFeina(Oficios feina) {
			return (ArrayList<Trabajador>) service.getListPorFeina(feina);
		
		}
		
		//2.2 Endpoint para subir foto
 	    
		@PostMapping(value = "/foto")
	    public String subirFoto (@RequestParam("foto")MultipartFile archivo) {
			   return service.addFoto(archivo);
		}

		

		
	    
	}