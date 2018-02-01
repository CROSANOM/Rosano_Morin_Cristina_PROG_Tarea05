package tarea05;

import utilidades.Entrada;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// instanciar la clase AlquilerVehiculos

		AlquilerVehiculos miAlquiler = new AlquilerVehiculos();

		// Creamos y añadimos clientes- turismo - alquiler

		// creamos un nuevo cliente(String nombre, String dni, String direccion, String
		// localidad, String codigoPostal)
		Cliente cliente1 = new Cliente("Cristina", "75875453V", "calle Melanc", "Tarifa­", "11380");
		Cliente cliente2 = new Cliente("Luis", "75875452V", "bb", "Cadiz", "04002");
		// anadimos los clientes 1 -2
		miAlquiler.anadeCliente(cliente1);
		miAlquiler.anadeCliente(cliente2);

		// Creamos un turismo (String matricula, String marca, String modelo, int
		// cilindrada)
		Turismo turismo1 = new Turismo("1111BBB", "Seat", "Ibiza", 1900);
		Turismo turismo2 = new Turismo("2222BBB", "Opel", "Corsa", 1600);
		
		// ponemos disponible el turismo ( forzamos la disponibilidad con un set) 
		
		turismo1.setDisponibilidad(true);
		turismo2.setDisponibilidad(true);
		// añadimos turismo
		
		miAlquiler.anadeTurismo(turismo1);
		miAlquiler.anadeTurismo(turismo2);

		// creamos un alquiler ( Cliente cliente, Turismo turismo )
		miAlquiler.abrirAlquiler(cliente1, turismo1);
		miAlquiler.abrirAlquiler(cliente2, turismo2);

		// cerrar alquiler del cliente1

		miAlquiler.cerrarAlquiler(cliente1, turismo1);

		for (Cliente cliente : miAlquiler.getClientes())
			if (cliente != null)
				System.out.println(cliente);
		System.out.println("--------------");
		for (Turismo turismo : miAlquiler.getTurismo())
			if (turismo != null)
				System.out.println(turismo);
		System.out.println("--------------");
		for (Alquiler alquiler : miAlquiler.getAlquileres())
			if (alquiler != null)
				System.out.println(alquiler);

		// el menu imprimir el menu y sus opciones
		int opcion;

		do {
			System.out.println("Alquiler Vehiculos");
			System.out.println("/n---------------");
			System.out.println("1.- Añadir cliente");
			System.out.println("2.- Borrar cliente");
			System.out.println("3.- Listar clientes");
			System.out.println("4.- Añadir ­Turismo");
			System.out.println("5.- Borrar Turismo");
			System.out.println("6.- Listar Turismo");
			System.out.println("7.- Abrir un Alquiler");
			System.out.println("8.- Cerrar alquiler");
			System.out.println("9.- Listar alquiler");
			System.out.println("0.- Salir");

			do {
				System.out.print("\nElige una opciÃ³n (0-10): ");
				opcion = Entrada.entero();
			} while (opcion < 0 || opcion > 10);
			switch (opcion) {
			case 1:// añade c
				Cliente nuevoCliente = null;
				do {
					System.out.println("\nAÃ±adir cliente");
					System.out.println("--------------");
					System.out.print("Nombre: ");
					String nombre = Entrada.cadena();
					System.out.print("DNI: ");
					String dni = Entrada.cadena();
					System.out.print("DirecciÃ³n: ");
					String direccion = Entrada.cadena();
					System.out.print("Localidad: ");
					String localidad = Entrada.cadena();
					System.out.print("CÃ³digo postal: ");
					String codigoPostal = Entrada.cadena();
					try {
						nuevoCliente = new Cliente(nombre, dni, direccion, localidad, codigoPostal);
					} catch (ExcepcionAlquilerVehiculos e) {
						System.out.printf("ERROR: %s%n%n", e.getMessage());
						System.out.println("Vuelve a introducir los datos de forma correcta");
					}
				} while (nuevoCliente == null);
				try {
					miAlquiler.anadeCliente(nuevoCliente);
					;
				} catch (ExcepcionAlquilerVehiculos e) {
					System.out.printf("ERROR: %s%n%n", e.getMessage());
				}
				break;
			case 2:// borrar c
				System.out.println("\nBorrar cliente");
				System.out.println("--------------");
				System.out.print("\nIntroduce el DNI del cliente a borrar: ");
				String dniBorrar = Entrada.cadena();
				try {
					miAlquiler.borrarCliente(dniBorrar);
					System.out.println("Cliente borrado satisfactoriamente\n");
				} catch (Exception e) {
					System.out.printf("ERROR: %s%n%n", e.getMessage());
				}
				break;

			case 3:// lista c
				System.out.println("\nListado de clientes");
				System.out.println("-------------------");
				for (Cliente cliente : miAlquiler.getClientes()) {
					if (cliente != null)
						System.out.println(cliente);
				}
				System.out.println("");
				break;
			case 4: // anadir t (Turismo turismo )
				Turismo nuevoTurismo = null;
				System.out.println("\nAñade turismo");
				System.out.println("---------------");
				System.out.print("Matricula: ");
				String matriculaNueva = Entrada.cadena();
				System.out.print("Marca: ");
				String marcaNueva = Entrada.cadena();
				System.out.print("Modelo: ");
				String modeloNuevo = Entrada.cadena();
				System.out.print("Cilindrada: ");
				int cilindradaNueva = Entrada.entero();
				nuevoTurismo.setDisponibilidad(true);
				try {
					nuevoTurismo = new Turismo(matriculaNueva, marcaNueva, modeloNuevo, cilindradaNueva);
					miAlquiler.anadeTurismo(nuevoTurismo);
				} catch (ExcepcionAlquilerVehiculos e) {
					System.out.printf("ERROR: %s%n%n", e.getMessage());
				}
				break;
			case 5:// borrar t ( String matricula )
				System.out.println("\nBorrar Turismo");
				System.out.println("---------------");
				System.out.print("\nIntroduce la matricula del vehiculo a borrar: ");
				String matriculaBorrar = Entrada.cadena();
				try {
					miAlquiler.borrarTurismo(matriculaBorrar);
					System.out.println("Turismo borrado satisfactoriamente\n");
				} catch (ExcepcionAlquilerVehiculos e) {
					System.out.printf("ERROR: %s%n%n", e.getMessage());
				}
				break;

			case 6:// listar t
				System.out.println("\nListado de vehÃ­culos");
				System.out.println("--------------------");
				for (Turismo turismo : miAlquiler.getTurismo()) {
					if (turismo != null)
						System.out.println(turismo);
				}
				System.out.println("");
				break;
			case 7:// abrir alquiler
				System.out.println("\nAbrir alquiler");
				System.out.println("-------------");
				System.out.print("\nIntroduce la matricula : ");
				// pasamos una matricula y un dni

				String matriculaAlquiler = Entrada.cadena();
				Turismo turismoAlquilado = miAlquiler.getTurismo(matriculaAlquiler); // llamada al metodo pasamo un
																						// vehiculo

				String dniAlquiler = Entrada.cadena();
				Cliente clienteAlquila = miAlquiler.getCliente(dniAlquiler); // llamada a metodo pasamos dni un Cliente

				// comprueba si alquier existe
				if (turismoAlquilado == null)
					System.out.println("ERROR: No existe un vehiculo con dicha matricula\n");
				else {
					try {
						miAlquiler.abrirAlquiler(clienteAlquila, turismoAlquilado); // se llama al metodo
																					// alquilerVehiculos pasamos cliente
																					// y un turismo
						System.out.println("Alquiler abierto satisfactoriamente\n");
					} catch (ExcepcionAlquilerVehiculos e) {
						System.out.printf("ERROR: %s%n%n", e.getMessage());
					}
				}
				break;
			case 8:// cerrar alquiler ( turismoAlquilado, clienteAlquila)
				System.out.println("\nCerrar alquiler");
				System.out.println("-------------");
				
				System.out.print("\nIntroduce la matricula : ");
				// pasamos una matricula y un dni

				String matriculaCerrar = Entrada.cadena();
				Turismo turismoCerrar = miAlquiler.getTurismo(matriculaCerrar); // llamada al metodo pasamo un
				
				// pasamos un dni 
				
				String dniCerrar = Entrada.cadena();
				Cliente clienteCerrar = miAlquiler.getCliente(dniCerrar); // llamada a metodo pasamos dni un Client

			   //  objetos clienteCerrar - turismoCerrar
			
				 turismoCerrar= miAlquiler.getTurismo(matriculaCerrar); 
				clienteCerrar = miAlquiler.getCliente(dniCerrar); // llamada a metodo pasamos dni un Cliente

				// comprueba si alquier existe
				if (turismoCerrar == null)
					System.out.println("ERROR: No existe un vehiculo con dicha matricula\n");
				else {
					try {
						miAlquiler.cerrarAlquiler(clienteCerrar, turismoCerrar); // se llama al metodo pasamos dos objetos 
																					
						System.out.println("Alquiler se cerro satisfactoriamente\n");
					} catch (ExcepcionAlquilerVehiculos e) {
						System.out.printf("ERROR: %s%n%n", e.getMessage());
					}
				}
				break;

			case 9:// listar alquiler

				System.out.println("\nListado de Alquiler");
				System.out.println("---------------------");
				for (Alquiler alquiler : miAlquiler.getAlquileres()) {
					if (alquiler != null)
						System.out.println(alquiler);
				}
				System.out.println("");
				break;
			default:
				break;
			}
		} while (opcion != 0);
	}

}
