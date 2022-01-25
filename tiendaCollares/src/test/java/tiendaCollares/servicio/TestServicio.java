package tiendaCollares.servicio;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import tiendaCollares.modelo.ModeloTienda;
import tiendaCollares.repositorio.TiendaRepo;

class TestServicio {

	@Mock
	private TiendaRepo tiendarepo;
	
	@InjectMocks
	private ServicioTienda serviciotienda;
	
	private ModeloTienda tienda = new ModeloTienda();
	
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(getClass());
		
		tienda.setId(null);
		tienda.setNombreTienda("La PePa");
		tienda.setNumMaxCollares(12);
		
	}
	
	
	@Test
	void findAll() {
		when(tiendarepo.findAll()).thenReturn((List<ModeloTienda>) tienda);
		assertNotNull(serviciotienda.tiendaDAO.findAll());
		
		
	}
	
	
}
