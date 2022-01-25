package tiendaCollares.controlador;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Calendar;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import tiendaCollares.modelo.ModeloCollar;
import tiendaCollares.modelo.ModeloTienda;
import tiendaCollares.repositorio.CollarRepo;
import tiendaCollares.repositorio.TiendaRepo;
import tiendaCollares.servicio.ServicioCollar;
import tiendaCollares.servicio.ServicioTienda;

@SpringBootTest
class controladorTest {
	
	@Mock
	private TiendaRepo tiendarepo;
	
	@Mock
	private CollarRepo collarrepo;
	
	@InjectMocks
	private ServicioTienda serviciotienda;
	
	@InjectMocks
	private ServicioCollar serviciocollar;
	
	@InjectMocks
	private Controlador controlador;
	
	private ModeloTienda tienda = new ModeloTienda();
	private ModeloCollar collar = new ModeloCollar();
	
	@SuppressWarnings("deprecation")
	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(getClass());
		
		tienda.setId((long) 1);
		tienda.setNombreTienda("La PePa");
		tienda.setNumMaxCollares(12);
		collar.setFechaentrada(Calendar.getInstance().getTime());
		collar.setId((long) 1);
		collar.setNombreautor("Miguel");
		collar.setPrecio((float) 34.0);
		collar.setTienda(tienda);
		
	}
	
	
	@Test
	void controlador() {
			when(tiendarepo.findAll()).thenReturn((List<ModeloTienda>) tienda);
			assertNotNull(controlador.listbyId((long) 1));
	}
	
	
	
}
