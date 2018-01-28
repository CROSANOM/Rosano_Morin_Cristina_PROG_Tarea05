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

	private int MAX_TURISMO = 120; // indicar el tamaño del array se quiere tener 50 turismo de reserva
	private int MAX_CLIENTES = 100;
	private int MAX_ALQUILERES = 100;


	// Punto20 constructor por defecto crear los atributos instancia arrays

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

	

}

// METODO QUE BORRA CLIENTES DESPUES DE ENCONTRARLOS 

/*public void borrarCliente(String dni) {
int posicion = 0;// posicion es el i del array  primero se parte de cero posicion 

boolean encontrado = false; // encontrado a priori se parte como nulo 
while (posicion < clientes.length && !encontrado) {
    if (clientes[posicion] != null && clientes[posicion].getDni().equals(dni))
        encontrado = true;
    else
        posicion++;
}
if (encontrado) {
    for (int i = posicion; i < clientes.length - 1; i++) {
        clientes[i] = clientes[i+1];
    }
    clientes[clientes.length - 1] = null;
}
else {
    throw new ExcepcionTallerMecanico("El cliente a borrar no existe");
}
}*/