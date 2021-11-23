package Interfaz;

import TipoVehículos.Vehiculo;

public class Ejecutador{
		
		
	public void execute(Vehiculo v, IAcciones accion) {
		accion.execute(v);
		
	}
}
