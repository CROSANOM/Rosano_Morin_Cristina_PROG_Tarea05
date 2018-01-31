package tarea05;

/**
 * @author crosanom
 *
 */

// Punto19 Crear la clase AlquilerVehiculos con sus atributos y visibilidad
// adecuados.

public class AlquilerVehiculos {

	private Turismo[] turismo; // Array de tipo Turismo
	private Cliente[] clientes; // Array de tipo Cliente
	private Alquiler[] alquileres; // Array de tipo Alquiler

	private final int MAX_TURISMO = 120; // indicar el tama�o del array se quiere tener 50 turismo de reserva
	private final int MAX_CLIENTES = 100;
	private final int MAX_ALQUILERES = 100;

	// Punto20 constructor inicializa los atributos crea los array

	public AlquilerVehiculos() {

		clientes = new Cliente[MAX_CLIENTES];
		turismo = new Turismo[MAX_TURISMO];
		alquileres = new Alquiler[MAX_ALQUILERES];
	}

	// Punto21 Crea los metodos get para cada atributo
	/**
	 * @return the MAX_TURISMO
	 */
	public int getMAX_TURISMO() {
		return MAX_TURISMO;
	}

	/**
	 * @return the MAX_CLIENTES
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

	// Punto22 Crear el metodo getCliente (String DNI ) similar al metodo Cliente
	// buscar de la tarea de Taller Mecanico

	public Cliente getCliente(String dni) {
		int posicion = 0;
		boolean encontrado = false;
		while (posicion < clientes.length && !encontrado) {
			if (clientes[posicion] != null && clientes[posicion].getDni().equals(dni))
				encontrado = true;
			else
				posicion++;
		}
		if (encontrado)
			return clientes[posicion];
		else
			return null;
	}

	/*
	 * Punto23 Crear metodo a�adirCliente que se le pasa por parametro un cliente
	 * que a�ada un cliente al array de clientes si cabe y si no existe ning�n otro
	 * con el mismo DNI o lance una excepci�n en caso contrario.
	 */

	/**
	 * @param cliente
	 */
	public void anadeCliente(Cliente cliente) {

		int posicion = 0;
		boolean posicionEncontrada = false;

		while (posicion < clientes.length && !posicionEncontrada) { // mientras posicion sea menor que el array y que
			// distinta a la encontrada
			if (clientes[posicion] == null) // si posici�n esta vacia
				posicionEncontrada = true; // posicion pasa de false a encontrada

			// si la posici�n en la que estoy tiene un dni es igual al dni de mi cliente que
			// quiero a�adir
			else if (clientes[posicion].getDni().equals(cliente.getDni()))

				throw new ExcepcionAlquilerVehiculos("Ya existe un cliente con ese DNI"); // salta excepci�n con msm
			// cliente exite
			else
				posicion++; // sino paso a la posici�n siguiente
		}

		// Si habia hueco y no est� repetido, a�ade el cliente.
		if (posicionEncontrada)
			clientes[posicion] = cliente;
		else
			throw new ExcepcionAlquilerVehiculos("El array de clientes est� lleno."); // sino lanzo una excepcion
	}


}
