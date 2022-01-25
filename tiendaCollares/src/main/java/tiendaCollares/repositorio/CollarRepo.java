package tiendaCollares.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tiendaCollares.modelo.ModeloCollar;
import tiendaCollares.modelo.ModeloTienda;

@Repository
public interface CollarRepo extends JpaRepository<ModeloCollar,Long>  {

	ModeloCollar save(ModeloCollar nuevo);
	
	List<ModeloCollar> findByTienda(ModeloTienda tienda);
	
	Long deleteAllByTienda(ModeloTienda tienda);

}
