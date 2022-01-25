package tiendaCollares.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "tienda")
public class ModeloTienda {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre_tienda")
	private String nombreTienda;
	
	@Column(name = "max_piezas")
	private int numMaxCollares;
	
	@OneToMany(mappedBy = "tienda", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ModeloCollar> collar;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreTienda() {
		return nombreTienda;
	}
	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}
	public int getNumMaxCollares() {
		return numMaxCollares;
	}
	public void setNumMaxCollares(int numMaxCollares) {
		this.numMaxCollares = numMaxCollares;
	}
	
	public List<ModeloCollar> getCollar() {
		return collar;
	}
	public void setCollar(List<ModeloCollar> collar) {
		this.collar = collar;
	}
	
	public ModeloTienda() {}
	
}