package paq.repositorio;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import paq.enumerador.Oficios;
import paq.modelo.Trabajador;

@Repository
public interface Repositorio extends JpaRepository<Trabajador,Long>{
	
	List<Trabajador> findByFeina(Oficios feina) ;
	
	
}

