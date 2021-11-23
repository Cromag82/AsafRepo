package Interfaz;

import TipoVehículos.Vehiculo;

@FunctionalInterface
public interface IAcciones {
		
	void execute(Vehiculo v);
	
}
