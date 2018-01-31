package tarea05;


import utilidades.Entrada;

public class Principal { // clase

	public static void main(String[] args) {

		// Instanciar un alquilerVehiculo
		AlquilerVehiculos miAlquilerVehiculos = new AlquilerVehiculos();

		// Generar dos objetos clientes defecto con operado new

		Cliente cliente = new Cliente("Cristina", "75875453V", "Calle Melancolia", "Almeria", "04009");
		Cliente cliente2 = new Cliente("Luis", "31862610C", "Calle Melancolia", "Almeria", "04009");

		// LLmada metodos
		miAlquilerVehiculos.anadeCliente(cliente);
		miAlquilerVehiculos.anadeCliente(cliente2);
		miAlquilerVehiculos.borrarCliente(cliente.getDni());// borrar el cliente cristina
		miAlquilerVehiculos.getClientes();//

		// Generar dos objetos turismo defecto con operado new

		Turismo turismo = new Turismo("0727DVL", "Seat", "Ibiza", 1600);
		Turismo turismo2 = new Turismo("6431DXP", "Citroen", "Picasso", 1900);

		// añadimos Turismo
		miAlquilerVehiculos.anadeTurismo(turismo);
		miAlquilerVehiculos.anadeTurismo(turismo2);

		// cerramos Alquiler
		miAlquilerVehiculos.cerrarAlquiler(cliente2, turismo2);
		miAlquilerVehiculos.abrirAlquiler(cliente, turismo);

		// abrimos el alquiler
		miAlquilerVehiculos.abrirAlquiler(cliente2, turismo2);
		miAlquilerVehiculos.abrirAlquiler(cliente, turismo);

		// for mejorado
		// recorre un array y obtiene un objeto de dicho

		for (Cliente clientes : miAlquilerVehiculos.getClientes())
			if (cliente != null)
				System.out.println(cliente);
		System.out.println("--------------");
		for (Turismo turismos : miAlquilerVehiculos.getTurismo())
			;
		if (turismo != null)
			System.out.println(turismo);
		System.out.println("--------------");
		for (Alquiler alquiler : miAlquilerVehiculos.getAlquileres())
			;
		if (miAlquilerVehiculos != null)
			System.out.println(miAlquilerVehiculos);

		// Menu

		int opcion; // variable para opciones del menu

		// imprime el Menu de la aplicacion.
		do {
			System.out.println("\nAlquiler de Vehiculos");
			System.out.println("---------------");
			System.out.println("1.- Añadir cliente");
			System.out.println("2.- Borrar cliente");
			System.out.println("3.- Listar clientes");
			System.out.println("4.- Añadir turismo");
			System.out.println("5.- Borrar turismo");
			System.out.println("6.- Listar turismos");
			System.out.println("7.- Abrir alquiler");
			System.out.println("8.- Cerrar alquiler");
			System.out.println("9.- Listar alquileres");
			System.out.println("0.- Salir");

			do {
				System.out.print("\nElige una opción del 1 - 9 para salir usar 0: ");
				opcion = Entrada.entero();
			} while (opcion < 0 || opcion > 9); // itera hasta que la opcion sea la esperada
			Turismo turismoBuscado;
			switch (opcion) {
			case 1: // Añade un cliente
				Cliente nuevoCliente = null;
				
				break;
			case 2: // borrar Cliente
				
				break;
			case 3:// Listar Clientes usamos el metodo getCliente(dni)
				
				
				break;

			case 4: // Añadir Turismo
				
				
				break;
			case 5:// borrar Turismo
				
				break;
			case 6:// Listar Turismo
				
				
		
				break;
			case 7: // abrir alquiler

				throw new ExcepcionAlquilerVehiculos("Este metodo por ahora no tiene funcionalidad, en breve estara operativo");

			case 8: // cerrar el alquiler
				
				
				throw new ExcepcionAlquilerVehiculos("Este metodo por ahora no tiene funcionalidad, en breve estara operativo");
				
			case 9:// listar alquiler
				
				break;
			default:
				break;
				}
				
			
		} while (opcion != 0);
	}

}
