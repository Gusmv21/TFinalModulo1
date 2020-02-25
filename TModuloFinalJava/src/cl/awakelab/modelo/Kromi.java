/**
 * 
 */
package cl.awakelab.modelo;

import java.util.Date;

/**
 * @author Gu
 *
 */
public class Kromi extends Carro{
	

	private int anoFabricacion;
	private String marca;
	
	
	public Kromi(int cantOcupantes, Date fechaIngresoInstitucion, String ubicacion, 
			int anoFabricacion, String marca) {
		super(cantOcupantes, fechaIngresoInstitucion, ubicacion);
		this.anoFabricacion = anoFabricacion;
		this.marca = marca;
	}
	
}
