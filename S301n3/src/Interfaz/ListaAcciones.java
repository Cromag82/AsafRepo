package Interfaz;

import java.util.ArrayList;
import java.util.List;

import TipoVehículos.Vehiculo;

public class ListaAcciones implements IAcciones {

		private List<IAcciones> accion = new ArrayList<IAcciones>(); 
		
		public void recibirAccion(IAcciones accion) {
			this.accion.add(accion)  ;
		}
		
		@Override
		public void execute(Vehiculo v) {
			this.accion.forEach(x -> x.execute(v));
		}
			
				
}
