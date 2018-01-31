package tarea05;

/**
 * @author crosanom
 *
 */

// Punto19 Crear la clase AlquilerVehiculos con sus atributos y visibilidad
// adecuados

public class AlquilerVehiculos {

	private Turismo[] turismos; // Array de tipo Turismo
	private Cliente[] clientes; // Array de tipo Cliente
	private Alquiler[] alquileres; // Array de tipo Alquiler

	private final int MAX_TURISMO = 120; // indicar el tamaño del array se quiere tener 50 turismo de reserva
	private final int MAX_CLIENTES = 100;
	private final int MAX_ALQUILERES = 100;

	// Punto20 constructor inicializa los atributos crea los array

	public AlquilerVehiculos() {

		clientes = new Cliente[MAX_CLIENTES];
		turismos = new Turismo[MAX_TURISMO];
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
		return turismos;
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
	 * Punto23 Crear metodo añadirCliente que se le pasa por parametro un cliente
	 * que añada un cliente al array de clientes si cabe y si no existe ningún otro
	 * con el mismo DNI o lance una excepción en caso contrario.
	 */

	/**
	 * @param cliente
	 */
	public void anadeCliente(Cliente cliente) {

		int posicion = 0;
		boolean posicionEncontrada = false;

		while (posicion < clientes.length && !posicionEncontrada) { // mientras posicion sea menor que el array y que
			// distinta a la encontrada
			if (clientes[posicion] == null) // si posición esta vacia
				posicionEncontrada = true; // posicion pasa de false a encontrada

			/*
			 * si la posición en la que estoy tiene un dni y es igual al dni de mi cliente
			 * que quiero añadir
			 */
			else if (clientes[posicion].getDni().equals(cliente.getDni()))

				throw new ExcepcionAlquilerVehiculos("Ya existe un cliente con ese DNI"); // salta excepción con msm
			// cliente exite
			else
				posicion++; // sino paso a la posición siguiente
		}

		// Si habia hueco y no está repetido, se añade el cliente.
		if (posicionEncontrada)
			clientes[posicion] = cliente;
		else
			throw new ExcepcionAlquilerVehiculos("El array de clientes está lleno."); // sino lanzo una excepcion
	}

	/*
	 * Punto24 Crea un método delCliente que borre un cliente, dado su DNI (
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
					System.out.println("Eliminado el cliente con éxito");

				} else
					posicion++;
			}
		}

		if (!posicionEncontrada) {
			System.out.println("No existe el cliente a borrar.");
		}

	}

	/*
	 * Punto25 Crea un método getTurismo que se le pase la matrícula de un turismo y
	 * nos lo devuelva si este existe o null en caso contrario.
	 */

	/**
	 * @param matricula
	 * @return
	 */
	public Turismo getTurismo(String matricula) {
		int posicion = 0;
		boolean encontrado = false;

		while (posicion < turismos.length && !encontrado) {
			if (turismos[posicion] != null && turismos[posicion].getMatricula().equals(matricula))
				encontrado = true;
			else
				posicion++;
		}
		if (encontrado)
			return turismos[posicion]; // devuelve Turismo turismo
		else
			return null; //
	}

	/*
	 * Punto 26 Crea un método addTurismo que añada un turismo al array de turismos
	 * si cabe y no existe ningún otro con la misma matrícula o lance una excepción
	 * en caso contrario.
	 */

	/**
	 * @param turismos
	 */
	public void anadeTurismo(Turismo turismo) {

		int posicion = 0;
		boolean posicionEncontrada = false;

		while (posicion < turismos.length && !posicionEncontrada) { // mientras posicion sea menor que el array y que
			// distinta a la encontrada
			if (turismos[posicion] == null) // si posición esta vacia
				posicionEncontrada = true; // posicion pasa de false a encontrada

			/*
			 * si la posición en la que estoy tiene un turismo y es igual al matricula de mi
			 * turismo que quiero añadir
			 */
			else if (turismos[posicion].getMatricula().equals(turismo.getMatricula()))

				throw new ExcepcionAlquilerVehiculos("Ya existe un tursimo con esta matricula"); // salta excepción con
																									// msm
			// cliente exite
			else
				posicion++; // sino paso a la posición siguiente
		}

		// Si habia hueco y no está repetido, se añade el turismo.
		if (posicionEncontrada)
			turismos[posicion] = turismo;
		else
			throw new ExcepcionAlquilerVehiculos("El array de turismo está lleno."); // sino lanzo una excepcion
	}

	/*
	 * Punto 27 Crea un método delTurismo que borre un turismo, dada su matrícula,
	 * del array de turismos si este existe
	 */

	/**
	 * @param matricula
	 */
	public void borrarTurismo(String matricula) {

		int posicion = 0;
		boolean posicionEncontrada = false;

		while (posicion < turismos.length && !posicionEncontrada) {

			if (turismos[posicion] == null) // Posicion vacia.
				posicion++; // No hay turismo, pasar siguiente.

			else {

				if (turismos[posicion].getMatricula().equals(matricula)) {

					if (turismos[posicion].isDisponibilidad()) {
						// Borro cliente y salgo del while.
						turismos[posicion] = null;
						posicionEncontrada = true;
						System.out.println("Eliminado el turismo con éxito");
					} else {
						throw new ExcepcionAlquilerVehiculos(
								"Este turismo está actualmente en uso, no se puede eliminar.");
					}

				} else
					posicion++;
			}
		}

		if (!posicionEncontrada) {
			System.out.println("No existe el turismo a borrar.");
		}

	}

	/*
	 * Punto 28 Crea un método openAlquiler que dado un cliente y un turismo cree un
	 * nuevo alquiler y lo añada al array de alquileres. Para ello se debe comprobar
	 * que el turismo esté disponible. Haz un commit.
	 */

	/**
	 * @param cliente
	 * @param turismo
	 */
	public void abrirAlquiler(Cliente cliente, Turismo turismo) {

		int posicion = 0;
		boolean posicionEncontrada = false;

		// Si el vehiculo está disponible se busca hueco en array.
		if (turismo.isDisponibilidad()) {
			// Buscamos un hueco en el array.
			while (posicion < alquileres.length && !posicionEncontrada) {
				// Si la posicion está vacia se puede asignar el alquiler.
				if (alquileres[posicion] == null) {
					alquileres[posicion] = new Alquiler(cliente, turismo);
					posicionEncontrada = true;
					turismos[posicion].setDisponibilidad(false);
					System.out.println("Alquiler creado con éxito.");
				}
			}
			// Si no ha encontrado un hueco vacio.
			if (posicionEncontrada == false)
				System.out.println("Alquileres al máximo.");

		} else {
			throw new ExcepcionAlquilerVehiculos("El vehiculo no está disponible.");
		}

	}

	/*
	 * Punto29 Crea un método closeAlquiler que cierre el alquiler dado un cliente y
	 * un turismo
	 */

	/**
	 * @param cliente
	 * @param turismo
	 */
	public void cerrarAlquiler(Cliente cliente, Turismo turismo) {

		int posicion = 0;
		boolean posicionEncontrada = false;

		// Buscar en el array por los parámetros.
		while (posicion < alquileres.length && !posicionEncontrada) {

			// Comprobar si el alquiler esta abierto.
			if (alquileres[posicion].getDias() == 0) {
				// Comparar uno de los parámetros del alquiler.
				if (alquileres[posicion].getCliente().getDni() == cliente.getDni()
						&& alquileres[posicion].getTurismo().getMatricula() == turismo.getMatricula()) {
					posicionEncontrada = true;
					// Cerrar alquiler.
					alquileres[posicion].cerrarAlquiler();
					System.out.println("Alquiler cerrado con éxito.");

				} else {
					// Si no es el alquiler, se pasa posicion.
					posicion++;
				}

			} else {
				posicion++;
			}
		}

		if (!posicionEncontrada) {
			System.out.println("No existe ese alquiler con esos datos.");
		}

	}

}// finClase
