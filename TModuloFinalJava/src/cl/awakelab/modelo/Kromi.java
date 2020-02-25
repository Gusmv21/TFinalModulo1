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
	
	//constructor kormis
	public Kromi(int cantOcupantes, Date fechaIngresoInstitucion, String ubicacion, 
			int anoFabricacion, String marca) {
		super(cantOcupantes, fechaIngresoInstitucion, ubicacion);
		this.anoFabricacion = anoFabricacion;
		this.marca = marca;
		
		//get y set
		
	}

	public int getAnoFabricacion() {
		return anoFabricacion;
	}

	public void setAnoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
