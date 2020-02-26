/**
 * Clase hija Trupalla
 * @author Gonzalo Guzman/Gustavo Morales/ Paolo /Sebastian
 * 
 */
package cl.awakelab.modelo;
/**
 * @author Gu
 *
 */
public class Trupalla extends Carro {
	private int nivelArmadura;
	private String nombreManipulador;
	
	public Trupalla(int cantOcupantes, String fechaIngresoInstitucion, int fila, int columna, String nombreManipulador) {
		super(cantOcupantes, fechaIngresoInstitucion,  fila, columna);
		this.nivelArmadura = Math.random()*6;
		this.nombreManipulador = nombreManipulador;
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
	
	public void setNivelArmadura(String nivelArmadura) {
		this.nivelArmadura=nivelArmadura;
	}
//to string trupalla
	@Override
	public String toString() {
		return "Trupalla [nivelArmadura=" + nivelArmadura + ", nombreManipulador=" + nombreManipulador + "]";
	}
	
	
}
