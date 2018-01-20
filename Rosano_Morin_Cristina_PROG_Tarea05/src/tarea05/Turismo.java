package tarea05;
/**
 * 
 */

/**
 * @author crosanom
 *
 */

public class Turismo {
	
	private String matricula,marca,modelo;
	private int cilindrada;

	
	/**
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param cilindrada
	 */
	public Turismo(String matricula,String marca,String modelo,int cilindrada) {
		
	}


	public String getMatricula() {
		return matricula;
	}


	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public int getCilindrada() {
		return cilindrada;
	}


	@Override
	public String toString() {
		return "Turismo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", cilindrada="
				+ cilindrada + "]";
	}
	
	
	
	
	
	
	
	
}



