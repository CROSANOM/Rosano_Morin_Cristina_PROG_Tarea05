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

	private int MAX_TURISMO = 120; // indicar el tama�o del array se quiere tener 50 turismo de reserva
	private int MAX_CLIENTES = 100;
	private int MAX_ALQUILERES = 100;

	// Punto20 constructor inicializa los atributos crea los array

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

	// Punto22 Crear el metodo get Cliente (String DNI ) similar al metodo Cliente
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
	 * Punto23 Crear metodo a�adirCliente ue a�ada un cliente al array de clientes
	 * si cabe y si no existe ning�n otro con el mismo DNI o lance una excepci�n en
	 * caso contrario.
	 */

	
	public void anadirCliente(Cliente cliente) { 
		 int posicion = 0;
		boolean posicionEncontrada = false;
		while ( posicion  < clientes.length && !posicionEncontrada ){ // mientras posicion sea menor que el array y que distinta a la encontrada
			if (clientes[posicion] == null) // si posici�n esta vacia 
				posicionEncontrada = true; //  posicion pasa de false a encontrada 
			else if (clientes[posicion].getDni().equals(cliente.getDni())) // si la posici�n en la que estoy tiene un  dni es igual al dni de mi cliente que quiero a�adir 
				throw new ExcepcionAlquilerVehiculos("Ya existe un cliente con ese DNI"); // salta excepci�n con msm cliente exite 
			else
				posicion++; //  sino paso a la posici�n siguiente
		}
		if (posicionEncontrada) // y posicion encontrada true 
			clientes[posicion] = cliente; // por tanto entr� en if ejecuto  guardo en la posicion en la que  estoy un cliente nuevo ( a�ado un cliente ) 
		else
			throw new ExcepcionAlquilerVehiculos("El array de clientes est� lleno."); // sino lanzo una excepcion 
	}

	
	
	
	
	
	
}

// METODO QUE BORRA CLIENTES DESPUES DE ENCONTRARLOS

/*
 * public void borrarCliente(String dni) { int posicion = 0;// posicion es el i
 * del array primero se parte de cero posicion
 * 
 * boolean encontrado = false; // encontrado a priori se parte como nulo while
 * (posicion < clientes.length && !encontrado) { if (clientes[posicion] != null
 * && clientes[posicion].getDni().equals(dni)) encontrado = true; else
 * posicion++; } if (encontrado) { for (int i = posicion; i < clientes.length -
 * 1; i++) { clientes[i] = clientes[i+1]; } clientes[clientes.length - 1] =
 * null; } else { throw new
 * ExcepcionTallerMecanico("El cliente a borrar no existe"); } }
 */