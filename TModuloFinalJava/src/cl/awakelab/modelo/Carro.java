/**
 * 
 */
package cl.awakelab.modelo;

import java.util.*;

/**
 * @author Gonzalo Guzman/Gustavo Morales/ Paolo /Sebastian Clase Padre Carro.
 */

public class Carro {

	private int cantOcupantes;
	private String fechaIngresoInstitucion;
	private int ubicacionA;
	private int ubicacionB;

	/**
	 * @author Gonzalo Guzman/Gustavo Morales/ Paolo /Sebastian constructor del
	 *         objeto carro
	 * @param cantOcupantes;
	 * @param fechaIngresoInstitucion
	 * @param ubicacion
	 */

	public Carro(int cantOcupantes, Date fechaIngresoInstitucion, String ubicacion) {
		this.cantOcupantes = cantOcupantes;
		this.fechaIngresoInstitucion = fechaIngresoInstitucion;
		this.ubicacionA = Math.random() * 15;
		this.ubicacionB = Math.random() * 15;

		
	}

	
	
}