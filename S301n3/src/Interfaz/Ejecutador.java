package Interfaz;

import TipoVehÝculos.Vehiculo;

public class Ejecutador{
		
		
	public void execute(Vehiculo v, IAcciones accion) {
		accion.execute(v);
		
	}
}
