package Interfaz;

import TipoVeh�culos.Vehiculo;

public class Ejecutador{
		
		
	public void execute(Vehiculo v, IAcciones accion) {
		accion.execute(v);
		
	}
}
