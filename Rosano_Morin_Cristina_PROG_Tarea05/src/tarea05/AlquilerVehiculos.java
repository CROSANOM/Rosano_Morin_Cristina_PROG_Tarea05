package tarea05;

/**
 * @author crosanom
 *
 */

// Punto19 Crear la clase AlquilerVehiculos con sus atributos y visibilidad
// adecuados

public class AlquilerVehiculos {

	private int MAX_TURISMO = 100; // indicar el tamaño del array
	private int MAX_CLIENTES = 50;
	private int MAX_ALQUILERES = 50;

	private Turismo[] turismo; // tipo Turismo
	private Cliente[] clientes; // tipo Cliente
	private Alquiler[] alquileres; // tipo Alquiler

	// Punto2 0 constructor por defecto crear los atributos instancia arrays

	public AlquilerVehiculos() {

		clientes = new Cliente[MAX_CLIENTES];
		turismo = new Turismo[MAX_TURISMO];
		alquileres = new Alquiler[MAX_ALQUILERES];

	}

	// Punto21 Crea los metodos get para cada atributo
	/**
	 * @return the mAX_TURISMO
	 */
	public int getMAX_TURISMO() {
		return MAX_TURISMO;
	}

	/**
	 * @return the mAX_CLIENTES
	 */
	public int getMAX_CLIENTES() {
		return MAX_CLIENTES;
	}

	/**
	 * @return the mAX_ALQUILERES
	 */
	public int getMAX_ALQUILERES() {
		return MAX_ALQUILERES;
	}

	/**
	 * @return the turismo
	 */
	public Turismo[] getTurismo() {
		return turismo;
	}

	/**
	 * @return the clientes
	 */
	public Cliente[] getClientes() {
		return clientes;
	}

	/**
	 * @return the alquileres
	 */
	public Alquiler[] getAlquileres() {
		return alquileres;
	}

	// Punto22 Crear el metodo get Cliente (String DNI )

	public String getCliente(String dni) {

		

		return dni;

	}

}
