/**
 * 
 */
package tarea05;

/**
 * @author crosanom
 *
 */

// crear una clase que hereda de la clase Excepción
public class ExcepcionAlquilerVehiculos extends RuntimeException {

	// crear un atributo long
	private static final long serialVersionUID = 000000000000001;
	private String mensaje = "";

	// constructor de excepcion que llama a la clase padre con super
	public ExcepcionAlquilerVehiculos(String message) {
		super(message);	
	}
	
}
