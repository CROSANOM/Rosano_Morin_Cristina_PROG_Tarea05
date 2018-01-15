/**
 * 
 */

/**
 * @author crosanom
 *
 */
public class Cliente {

	private String nombre, direccion, localidad, codigoPostal;
	int identificador, numClientes;

	// crear el constructor clase Cliente con parametros
	/**
	 * @param nombre
	 * @param direccion
	 * @param localidad
	 * @param codigoPostal
	 * @param identificador
	 * @param numClientes
	 */
	public Cliente(String nombre, String direccion, String localidad, String codigoPostal, int identificador,
			int numClientes) {

	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public int getIdentificador() {
		return identificador;
	}

	public int getNumClientes() {
		return numClientes;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", codigoPostal="
				+ codigoPostal + ", identificador=" + identificador + ", numClientes=" + numClientes + "]";
	}

}