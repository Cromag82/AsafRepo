package tiendaCollares.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import tiendaCollares.modelo.ModeloTienda;

public interface TiendaRepo extends JpaRepository<ModeloTienda,Long> {
	

	
	
}
