/**
 * 
 */
package cl.awakelab.modelo;
import java.util.*:
/**
 * @author Gu
 *
 */
public class Tablero {
	
	private int tablero[][];
	private Carro carro;
	private ArrayList<Huevo> huevo;
	static final int  DIM_DEFAUL_TABLERO = 15;

	//constructor tablero no se si esta correcto
	public Tablero( int[][]tablero, Carro carro, ArrayList<Huevo> huevo) {
		this.tablero = tablero[DIM_DEFAUL_TABLERO][DIM_DEFAUL_TABLERO];
		huevo = new ArrayList<Huevo>();		
		carro[][] = new Carro();	
	}
}
