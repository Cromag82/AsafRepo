package Main;

import Interfaz.ListaAcciones;
import Interfaz.Acelerar;
import Interfaz.Arrancar;
import Interfaz.Ejecutador;
import Interfaz.Frenar;
import Interfaz.IAcciones;
import TipoVeh�culos.Avion;
import TipoVeh�culos.Barco;
import TipoVeh�culos.Bicicleta;
import TipoVeh�culos.Vehiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 
		Frenar Frenar = new Frenar();
		Acelerar Acelerar = new Acelerar();
		Arrancar Arrancar = new Arrancar();
		
		ListaAcciones accion = new ListaAcciones();
		
		accion.recibirAccion(Arrancar);
		accion.recibirAccion(Acelerar);
		accion.recibirAccion(Frenar);
		
		Vehiculo nuevoBarco = new Vehiculo("Barco");
		
		Ejecutador exe = new Ejecutador();
		
		exe.execute(nuevoBarco, Arrancar);
		exe.execute(nuevoBarco, Acelerar);
		exe.execute(nuevoBarco, Frenar);
		
		
	}

}
