/**
 * 
 */
package cl.awakelab.modelo;



/**
 * @author Gu
 *
 */
public class Caguano extends Carro {
	private int alcanceTiro;//aun nose bien cual tipo de atributo ponerle
	private String colorConfeti;
	
				
	public Caguano(int cantOcupantes, String fechaIngresoInstitucion, int ubicacionA, int ubicacionB,
			int alcanceTiro, String colorConfeti){
		super(cantOcupantes, fechaIngresoInstitucion, ubicacionA, ubicacionB);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}
	//get y set

	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	public String getColorConfeti() {
		return colorConfeti;
	}

	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}
	// to string clase cguano

	@Override
	public String toString() {
		return "Caguano [alcanceTiro=" + alcanceTiro + ", colorConfeti=" + colorConfeti + "]";
	}
	
	
}
