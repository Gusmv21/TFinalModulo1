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
	//get de los tres atributos y set de fecha y cant ocupantes
	
	public int getCantOcupantes() {
		return cantOcupantes;
	}

	public void setCantOcupantes(int cantOcupantes) {
		this.cantOcupantes = cantOcupantes;
	}

	public Date getFechaIngresoInstitucion() {
		return fechaIngresoInstitucion;
	}

	public void setFechaIngresoInstitucion(Date fechaIngresoInstitucion) {
		this.fechaIngresoInstitucion = fechaIngresoInstitucion;
	}

	public String getUbicacion() {
		return ubicacion;
	}
//to string clase carro
	@Override
	public String toString() {
		return "Carro [cantOcupantes=" + cantOcupantes + ", fechaIngresoInstitucion=" + fechaIngresoInstitucion
				+ ", ubicacion=" + ubicacion + "]";
	}
	
	

}