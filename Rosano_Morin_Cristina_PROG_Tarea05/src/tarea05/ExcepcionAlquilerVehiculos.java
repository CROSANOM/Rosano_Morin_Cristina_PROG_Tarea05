/**
 * 
 */
package tarea05;

/**
 * @author crosanom
 *
 */

// crear una clase que hereda de la clase Excepci�n
public class ExcepcionAlquilerVehiculos extends RuntimeException {

	// crean los atributos
	private static final long serialVersionUID010 = 1;
	private String mensaje = "";

	// constructor de excepcion que llama a la clase padre con super
	public ExcepcionAlquilerVehiculos(String message) {
		super(message);
	}

}
