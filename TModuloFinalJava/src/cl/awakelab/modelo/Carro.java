/**
 * Clase Carro Proyecto Modulo Java
 */
package cl.awakelab.modelo;

import java.util.*;

/**
 * @author Gonzalo Guzman/Gustavo Morales/ Paolo Mancini /Sebastian Ramirez 
 * Clase Padre Carro.
 */

public class Carro {

	private int cantOcupantes;
	private String fechaIngresoInstitucion;
	private int ubicacionA;
	private int ubicacionB;

	/**
	 * @author Gonzalo Guzman/Gustavo Morales/ Paolo Mancini /Sebastian Ramirez
	 *  Constructor del objeto Carro
	 * @param cantOcupantes;
	 * @param fechaIngresoInstitucion
	 * @param ubicacionA;
	 * @param ubicacionB;
	 */

	public Carro(int cantOcupantes, Date fechaIngresoInstitucion, int ubicacionA, int ubicacionB) {
		this.cantOcupantes = cantOcupantes;
		this.fechaIngresoInstitucion = fechaIngresoInstitucion;
		this.ubicacionA = Math.random() * 15;
		this.ubicacionB = Math.random() * 15;

		
	}

	//get y set de los atributos

	public int getCantOcupantes() {
		return cantOcupantes;
	}

	public void setCantOcupantes(int cantOcupantes) {
		this.cantOcupantes = cantOcupantes;
	}

	public String getFechaIngresoInstitucion() {
		return fechaIngresoInstitucion;
	}

	public void setFechaIngresoInstitucion(String fechaIngresoInstitucion) {
		this.fechaIngresoInstitucion = fechaIngresoInstitucion;
	}
	public int getUbicacionA() {
		return ubicacionA;
	}

	private void setUbicacionA(int ubicacionA) {
		this.ubicacionA = ubicacionA;
	}
	
	public int getUbicacionB() {
		return ubicacionB;
	}

	private void setUbicacionB(int ubicacionB) {
		this.ubicacionB = ubicacionB;
	}
	
	// to string clase Carro

	@Override
	public String toString() {
		return "Carro [Cantidad Ocupantes: " + cantOcupantes + ", Fecha Ingreso Institucion: " + fechaIngresoInstitucion 
				+ ", ubicacion: ("+ubicacionA+","+ubicacionB+")";
	}
	
	System.out.println(toString());
}

	
}