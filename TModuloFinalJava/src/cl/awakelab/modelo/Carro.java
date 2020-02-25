/**
 * 
 */
package cl.awakelab.modelo;
import java.util.Date;
/**
 * @author Gonzalo Guzman/Gustavo Morales/ Paolo /Sebastian
 * Clase Padre Carro.
 */


public class Carro {

	private int cantOcupantes;
	private Date fechaIngresoInstitucion;
	private  String ubicacion; //aun no tengo claro como definir este atributo

/**
 * @author Gonzalo Guzman/Gustavo Morales/ Paolo /Sebastian
 *constructor del objeto carro
 *@param cantOcupantes;
 *@param fechaIngresoInstitucion
 *@param ubicacion
 */

	public Carro(int cantOcupantes, Date fechaIngresoInstitucion, String ubicacion) {
		this.cantOcupantes = cantOcupantes;
		this.fechaIngresoInstitucion = fechaIngresoInstitucion;
		this.ubicacion = ubicacionCarro();

	}

	//metodo para definir ubicacion del objeto carro debe ser al azar

	public  String  ubicacionCarro() {
		return ubicacion;

	}

}