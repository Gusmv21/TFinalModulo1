/**
 * Clase hija Trupalla
 * @author Gonzalo Guzman/Gustavo Morales/ Paolo /Sebastian
 * 
 */


package cl.awakelab.modelo;

import java.util.Date;

/**
 * @author Gu
 *
 */
public class Trupalla extends Carro {
	private int nivelArmadura;
	private String nombreManipulador;
	
	
	
	public Trupalla(int cantOcupantes, Date fechaIngresoInstitucion, String ubicacion, 
			int nivelArmadura, String nombreManipulador) {
		super(cantOcupantes, fechaIngresoInstitucion,  ubicacion);
		this.nivelArmadura = nivelArmadura();
		this.nombreManipulador = nombreManipulador;
	}
	//metodo para descubrir el nivel de armadura de una trupalla, no esta creado aun, solo mencionado.
	public int nivelArmadura(){
		int armadura = 0;
		return armadura;
	}
	//get de ambos atribtos, set solo de nombre manipulador
	public String getNombreManipulador() {
		return nombreManipulador;
	}
	public void setNombreManipulador(String nombreManipulador) {
		this.nombreManipulador = nombreManipulador;
	}
	public int getNivelArmadura() {
		return nivelArmadura;
	}
//to string trupalla
	@Override
	public String toString() {
		return "Trupalla [nivelArmadura=" + nivelArmadura + ", nombreManipulador=" + nombreManipulador + "]";
	}
	

	
	
}
