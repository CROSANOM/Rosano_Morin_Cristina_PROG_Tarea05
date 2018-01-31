package tarea05;

/**
 * @author crosanom
 *
 */

// Punto19 Crear la clase AlquilerVehiculos con sus atributos y visibilidad
// adecuados

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

	/*
	 * Punto22 Crear el metodo getCliente (String DNI ) similar al metodo Cliente
	 * buscar de la tarea de Taller Mecanico
	 */

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
			return clientes[posicion]; // devuelve Cliente cliente
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

			/*
			 * si la posici�n en la que estoy tiene un dni y es igual al dni de mi cliente
			 * que quiero a�adir
			 */
			else if (clientes[posicion].getDni().equals(cliente.getDni()))

				throw new ExcepcionAlquilerVehiculos("Ya existe un cliente con ese DNI"); // salta excepci�n con msm
			// cliente exite
			else
				posicion++; // sino paso a la posici�n siguiente
		}

		// Si habia hueco y no est� repetido, se a�ade el cliente.
		if (posicionEncontrada)
			clientes[posicion] = cliente;
		else
			throw new ExcepcionAlquilerVehiculos("El array de clientes est� lleno."); // sino lanzo una excepcion
	}

	/*
	 * Punto24 Crea un m�todo delCliente que borre un cliente, dado su DNI (
	 * parametro) del array de clientes si este existe
	 */

	/**
	 * @param dni
	 */

	public void borrarCliente(String dni) {

		int posicion = 0;
		boolean posicionEncontrada = false;

		while (posicion < clientes.length && !posicionEncontrada) {

			if (clientes[posicion] == null) // Posicion vacia.
				posicion++; // No hay cliente, pasar siguiente.

			else {

				if (clientes[posicion].getDni().equals(dni)) {
					// Borro cliente y salgo del while.
					clientes[posicion] = null;
					posicionEncontrada = true;
					System.out.println("Eliminado el cliente con �xito");

				} else
					posicion++;
			}
		}

		if (!posicionEncontrada) {
			System.out.println("No existe el cliente a borrar.");
		}

	}

	/*
	 * Punto25 Crea un m�todo getTurismo que se le pase la matr�cula de un turismo y
	 * nos lo devuelva si este existe o null en caso contrario.
	 */

	/**
	 * @param matricula
	 * @return
	 */
	public Turismo getTurismo(String matricula) {
		int posicion = 0;
		boolean encontrado = false;

		while (posicion < turismo.length && !encontrado) {
			if (turismo[posicion] != null && turismo[posicion].getMatricula().equals(matricula))
				encontrado = true;
			else
				posicion++;
		}
		if (encontrado)
			return turismo[posicion]; // devuelve Turismo turismo
		else
			return null; //
	}

	/*
	 * Punto 26 Crea un m�todo addTurismo que a�ada un turismo al array de turismos
	 * si cabe y no existe ning�n otro con la misma matr�cula o lance una excepci�n
	 * en caso contrario.
	 */

	/**
	 * @param turismos
	 */
	public void anadeTurismo(Turismo turismos) {

		int posicion = 0;
		boolean posicionEncontrada = false;

		while (posicion < turismo.length && !posicionEncontrada) { // mientras posicion sea menor que el array y que
			// distinta a la encontrada
			if (turismo[posicion] == null) // si posici�n esta vacia
				posicionEncontrada = true; // posicion pasa de false a encontrada

			/*
			 * si la posici�n en la que estoy tiene un turismo y es igual al matricula de mi
			 * turismo que quiero a�adir
			 */
			else if (turismo[posicion].getMatricula().equals(turismos.getMatricula()))

				throw new ExcepcionAlquilerVehiculos("Ya existe un tursimo con esta matricula"); // salta excepci�n con
																									// msm
			// cliente exite
			else
				posicion++; // sino paso a la posici�n siguiente
		}

		// Si habia hueco y no est� repetido, se a�ade el turismo.
		if (posicionEncontrada)
			turismo[posicion] = turismos;
		else
			throw new ExcepcionAlquilerVehiculos("El array de turismo est� lleno."); // sino lanzo una excepcion
	}

	/*
	 * Punto 27 Crea un m�todo delTurismo que borre un turismo, dada su matr�cula,
	 * del array de turismos si este existe
	 */

	/**
	 * @param matricula
	 */
	public void borrarTurismo(String matricula) {

		int posicion = 0;
		boolean posicionEncontrada = false;

		while (posicion < turismo.length && !posicionEncontrada) {

			if (turismo[posicion] == null) // Posicion vacia.
				posicion++; // No hay turismo, pasar siguiente.

			else {

				if (turismo[posicion].getMatricula().equals(matricula)) {

					if (turismo[posicion].isDisponibilidad()) {
						// Borro cliente y salgo del while.
						turismo[posicion] = null;
						posicionEncontrada = true;
						System.out.println("Eliminado el turismo con �xito");
					} else {
						throw new ExcepcionAlquilerVehiculos(
								"Este turismo est� actualmente en uso, no se puede eliminar.");
					}

				} else
					posicion++;
			}
		}

		if (!posicionEncontrada) {
			System.out.println("No existe el turismo a borrar.");
		}

	}

}// finClase
