package tarea05;


import utilidades.Entrada;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int opcion;

		// do {

		// instanciar la clase AlquilerVehiculos

		AlquilerVehiculos miAlquiler = new AlquilerVehiculos();

		/*
		 * System.out.println(miAlquiler.getAlquileres()); AlquilerVehiculos no esta
		 * incializado
		 */

		// 1º Creamos y añadimos clientes- turismo - alquiler //

		// Clientes //

		/*
		 * creamos un nuevo cliente(String nombre, String dni, String direccion, String
		 * localidad, String codigoPostal)
		 */
		Cliente cliente1 = new Cliente("Cristina", "75875453V", "calle Melanc", "Tarifa­", "11380");
		Cliente cliente2 = new Cliente("Luis", "75875452V", "bb", "Cadiz", "04002");
		// mostramos el cliente1 por pantalla con el metodoToString
		System.out.println("Mostramos por pantalla el cliente1 " + cliente1.toString());
		System.out.println("Mostramos por pantalla el cliente2 " + cliente2.toString());
		// anadimos los clientes 1 -2
		miAlquiler.anadeCliente(cliente1);
		miAlquiler.anadeCliente(cliente2);
		System.out.println("Imprime el alquiler " + miAlquiler.toString());

		// Turismos //

		/*
		 * Creamos un turismo (String matricula, String marca, String modelo, int
		 * cilindrada)
		 */

		Turismo turismo1 = new Turismo("1111BBB", "Seat", "Ibiza", 1900);
		Turismo turismo2 = new Turismo("2222BBB", "Opel", "Corsa", 1600);
		// mostramos el turismo por Pantalla con el metodoToString
		System.out.println(turismo1.toString());
		System.out.println(turismo2.toString());
		// ponemos disponible el turismo ( forzamos la disponibilidad con un set)
		turismo1.setDisponibilidad(true);
		turismo2.setDisponibilidad(true);
		// imprimimos turismo para ver si ha cambiado la disponibilidad
		System.out.println("La disponibilidad de turismo1 es " + turismo1.isDisponibilidad()
				+ " La disponibilidad del turismo2 " + turismo2.isDisponibilidad());
		// añadimos turismo
		miAlquiler.anadeTurismo(turismo1);
		miAlquiler.anadeTurismo(turismo2);

		// imprimir estado de turismo

		System.out.println("El turismo " + turismo1 + "esta" + turismo1.isDisponibilidad());
		System.out.println("\n--");
		System.out.println("El turismo " + turismo2 + "esta" + turismo2.isDisponibilidad());

		// Alquiler //

		// Abrirmos un alquiler usar metodo abrirAlquiler si ok lanza msm

		miAlquiler.abrirAlquiler(cliente2, turismo2);

		// Para comprobar que ok todo imprimir pantalla el alquiler
		System.out.println("Imprime mi alquiler" + miAlquiler.toString());
		System.out.println("Ahora el coche cambio de estado, su disponibilidad es  " + turismo2.isDisponibilidad());

		// cerrar alquiler

		// Para comprobar que ok todo imprimir pantalla el alquiler y vehiculo comprobar
		// disponibilidad
		miAlquiler.cerrarAlquiler(cliente2, turismo2);
		System.out.println("Imprime mi alquiler" + miAlquiler.toString());
		System.out.println("Despues de cerrar alquiler turismo2 cambió de estado, su disponibilidad es  "
				+ turismo2.isDisponibilidad());

		// for para recorrer y recuperar cliente, turismo y alquiler print cliente ,
		// turismos , alquileres

		for (Cliente cliente : miAlquiler.getClientes()) // clase AlquilerVehiculos
			if (cliente != null)
				System.out.println(cliente);
		System.out.println("--------------");
		for (Turismo turismo : miAlquiler.getTurismo())// clase AlquilerVehiculos
			if (turismo != null)
				System.out.println(turismo);
		System.out.println("--------------");
		for (Alquiler alquiler : miAlquiler.getAlquileres())
			if (alquiler != null)
				System.out.println(alquiler);

		// MENU

		System.out.println("MENU DE LA APLICACION:");
		System.out.println("/n");
		System.out.println("Alquiler Vehiculos");
		System.out.println("\n---------------");
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

		// do - while valida la entrada 
	
		
		do {
			System.out.print("\nElige una opción (1-9) para salir pulsar 0: ");
			opcion = Entrada.entero();
		} while (opcion < 0 || opcion > 9); // entra en bucle
		switch (opcion) {
			case 1:
				Cliente nuevoCliente = null;
				do {
					System.out.println("\nAñadir cliente");
					System.out.println("--------------");
					System.out.print("Nombre: ");
					String nombre = Entrada.cadena();
					System.out.print("DNI: ");
					String dni = Entrada.cadena();
					
					System.out.print("Direccion: ");
					String direccion = Entrada.cadena();
					System.out.print("Localidad: ");
					String localidad = Entrada.cadena();
					System.out.print("Codigo postal: ");
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
				} catch (ExcepcionAlquilerVehiculos e) {
					System.out.printf("ERROR: %s%n%n", e.getMessage());
				}
				break;
			case 2:
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
			
			case 4:
				System.out.println("\nListado de clientes");
				System.out.println("-------------------");
				for (Cliente cliente: miAlquiler.getClientes()) {
					if (cliente != null)
						System.out.println(cliente);
				}
				System.out.println("");
				break;
			case 5:
				Turismo nuevoTurismo = null;
				System.out.println("\nAñadir Turismo");
				System.out.println("---------------");
				System.out.println("Matricula: ");
				String matricula = Entrada.cadena();
				System.out.print("Marca: ");
				String marca = Entrada.cadena();
				System.out.print("Modelo: ");
				String modelo = Entrada.cadena();
				System.out.print("Cilindrada: ");
				int cilindrada = Entrada.entero();
				try {
					nuevoTurismo = new Turismo( matricula, marca, modelo, cilindrada);
					miAlquiler.anadeTurismo(nuevoTurismo);
				} catch (ExcepcionAlquilerVehiculos e) {
					System.out.printf("ERROR: %s%n%n", e.getMessage());
				}
				break;
			case 6:
				System.out.println("\nBorrar vehiculo");
				System.out.println("---------------");
				System.out.print("\nIntroduce la matrÃ­cula del vehiculo a borrar: ");
				String matriculaBorrar = Entrada.cadena();
				try {
					miAlquiler.borrarTurismo(matriculaBorrar);
					System.out.println("Turismo borrado satisfactoriamente\n");
				} catch (ExcepcionAlquilerVehiculos e) {
					System.out.printf("ERROR: %s%n%n", e.getMessage());
				}
				break;
			
			case 8:
				System.out.println("\nListado de vehiculos");
				System.out.println("--------------------");
				for (Turismo turismo: miAlquiler.getTurismo()) {
					if (turismo != null)
						System.out.println(turismo);
				}
				System.out.println("");
				break;
			case 9:
				System.out.println("\nAbrir Alquiler");
				System.out.println("-------------");
				System.out.print("\nIntroduce la matri­cula del vehi­culo: ");
				String matriculaBuscar = Entrada.cadena();
				Turismo turismoBuscado = miAlquiler.getTurismo(matriculaBuscar);
				System.out.print("\nIntroduce El dni: ");
				String dni1=Entrada.cadena();
				Cliente nuevoCliente1=miAlquiler.getCliente(dni1);
				if (turismoBuscado == null)
					System.out.println("ERROR: No existe un vehÃ­culo con dicha matrÃ­cula\n");
				else {
						try {
							miAlquiler.abrirAlquiler(nuevoCliente1, turismoBuscado);
							System.out.println("Trabajo abierto satisfactoriamente\n");
						} catch (ExcepcionAlquilerVehiculos e) {
							System.out.printf("ERROR: %s%n%n", e.getMessage());
						}
				}
				break;
			case 10:
				
				System.out.println("dejar aqui");
				break;
		
				
			default:
				
		
	} while (opcion != 0);
		
		
		/*
		 * creamos un alquiler ( Cliente cliente, Turismo turismo )
		 * miAlquiler.abrirAlquiler(cliente1, turismo1);
		 * miAlquiler.abrirAlquiler(cliente2, turismo2);
		 * 
		 * // cerrar alquiler del cliente1
		 * 
		 * miAlquiler.cerrarAlquiler(cliente1, turismo1);
		 * 
		 * for (Cliente cliente : miAlquiler.getClientes()) if (cliente != null)
		 * System.out.println(cliente); System.out.println("--------------"); for
		 * (Turismo turismo : miAlquiler.getTurismo()) if (turismo != null)
		 * System.out.println(turismo); System.out.println("--------------"); for
		 * (Alquiler alquiler : miAlquiler.getAlquileres()) if (alquiler != null)
		 * System.out.println(alquiler);
		 * 
		 * /* el menu imprimir el menu y sus opciones
		 * 
		 * do { System.out.print("\nElige una opciÃ³n (0-10): "); opcion =
		 * Entrada.entero(); } while (opcion < 0 || opcion > 10); switch (opcion) { case
		 * 1:// añade c Cliente nuevoCliente = null; do {
		 * System.out.println("\nAÃ±adir cliente");
		 * System.out.println("--------------"); System.out.print("Nombre: "); String
		 * nombre = Entrada.cadena(); System.out.print("DNI: "); String dni =
		 * Entrada.cadena(); System.out.print("DirecciÃ³n: "); String direccion =
		 * Entrada.cadena(); System.out.print("Localidad: "); String localidad =
		 * Entrada.cadena(); System.out.print("CÃ³digo postal: "); String codigoPostal =
		 * Entrada.cadena(); try { nuevoCliente = new Cliente(nombre, dni, direccion,
		 * localidad, codigoPostal); } catch (ExcepcionAlquilerVehiculos e) {
		 * System.out.printf("ERROR: %s%n%n", e.getMessage());
		 * System.out.println("Vuelve a introducir los datos de forma correcta"); } }
		 * while (nuevoCliente == null); try { miAlquiler.anadeCliente(nuevoCliente); ;
		 * } catch (ExcepcionAlquilerVehiculos e) { System.out.printf("ERROR: %s%n%n",
		 * e.getMessage()); } break; case 2:// borrar c
		 * System.out.println("\nBorrar cliente"); System.out.println("--------------");
		 * System.out.print("\nIntroduce el DNI del cliente a borrar: "); String
		 * dniBorrar = Entrada.cadena(); try { miAlquiler.borrarCliente(dniBorrar);
		 * System.out.println("Cliente borrado satisfactoriamente\n"); } catch
		 * (Exception e) { System.out.printf("ERROR: %s%n%n", e.getMessage()); } break;
		 * 
		 * case 3:// lista c System.out.println("\nListado de clientes");
		 * System.out.println("-------------------"); for (Cliente cliente :
		 * miAlquiler.getClientes()) { if (cliente != null) System.out.println(cliente);
		 * } System.out.println(""); break; case 4: // anadir t (Turismo turismo )
		 * Turismo nuevoTurismo = null; System.out.println("\nAñade turismo");
		 * System.out.println("---------------"); System.out.print("Matricula: ");
		 * String matriculaNueva = Entrada.cadena(); System.out.print("Marca: "); String
		 * marcaNueva = Entrada.cadena(); System.out.print("Modelo: "); String
		 * modeloNuevo = Entrada.cadena(); System.out.print("Cilindrada: "); int
		 * cilindradaNueva = Entrada.entero(); nuevoTurismo.setDisponibilidad(true); try
		 * { nuevoTurismo = new Turismo(matriculaNueva, marcaNueva, modeloNuevo,
		 * cilindradaNueva); miAlquiler.anadeTurismo(nuevoTurismo); } catch
		 * (ExcepcionAlquilerVehiculos e) { System.out.printf("ERROR: %s%n%n",
		 * e.getMessage()); } break; case 5:// borrar t ( String matricula )
		 * System.out.println("\nBorrar Turismo");
		 * System.out.println("---------------");
		 * System.out.print("\nIntroduce la matricula del vehiculo a borrar: "); String
		 * matriculaBorrar = Entrada.cadena(); try {
		 * miAlquiler.borrarTurismo(matriculaBorrar);
		 * System.out.println("Turismo borrado satisfactoriamente\n"); } catch
		 * (ExcepcionAlquilerVehiculos e) { System.out.printf("ERROR: %s%n%n",
		 * e.getMessage()); } break;
		 * 
		 * case 6:// listar t System.out.println("\nListado de vehÃ­culos");
		 * System.out.println("--------------------"); for (Turismo turismo :
		 * miAlquiler.getTurismo()) { if (turismo != null) System.out.println(turismo);
		 * } System.out.println(""); break; case 7:// abrir alquiler
		 * System.out.println("\nAbrir alquiler"); System.out.println("-------------");
		 * System.out.print("\nIntroduce la matricula : "); // pasamos una matricula y
		 * un dni
		 * 
		 * String matriculaAlquiler = Entrada.cadena(); Turismo turismoAlquilado =
		 * miAlquiler.getTurismo(matriculaAlquiler); // llamada al metodo pasamo un //
		 * vehiculo
		 * 
		 * String dniAlquiler = Entrada.cadena(); Cliente clienteAlquila =
		 * miAlquiler.getCliente(dniAlquiler); // llamada a metodo pasamos dni un
		 * Cliente
		 * 
		 * // comprueba si alquier existe if (turismoAlquilado == null)
		 * System.out.println("ERROR: No existe un vehiculo con dicha matricula\n");
		 * else { try { miAlquiler.abrirAlquiler(clienteAlquila, turismoAlquilado); //
		 * se llama al metodo // alquilerVehiculos pasamos cliente // y un turismo
		 * System.out.println("Alquiler abierto satisfactoriamente\n"); } catch
		 * (ExcepcionAlquilerVehiculos e) { System.out.printf("ERROR: %s%n%n",
		 * e.getMessage()); } } break; case 8:// cerrar alquiler ( turismoAlquilado,
		 * clienteAlquila) System.out.println("\nCerrar alquiler");
		 * System.out.println("-------------");
		 * 
		 * System.out.print("\nIntroduce la matricula : "); // pasamos una matricula y
		 * un dni
		 * 
		 * String matriculaCerrar = Entrada.cadena(); Turismo turismoCerrar =
		 * miAlquiler.getTurismo(matriculaCerrar); // llamada al metodo pasamo un
		 * 
		 * // pasamos un dni
		 * 
		 * String dniCerrar = Entrada.cadena(); Cliente clienteCerrar =
		 * miAlquiler.getCliente(dniCerrar); // llamada a metodo pasamos dni un Client
		 * 
		 * // objetos clienteCerrar - turismoCerrar
		 * 
		 * turismoCerrar= miAlquiler.getTurismo(matriculaCerrar); clienteCerrar =
		 * miAlquiler.getCliente(dniCerrar); // llamada a metodo pasamos dni un Cliente
		 * 
		 * // comprueba si alquier existe if (turismoCerrar == null)
		 * System.out.println("ERROR: No existe un vehiculo con dicha matricula\n");
		 * else { try { miAlquiler.cerrarAlquiler(clienteCerrar, turismoCerrar); // se
		 * llama al metodo pasamos dos objetos
		 * 
		 * System.out.println("Alquiler se cerro satisfactoriamente\n"); } catch
		 * (ExcepcionAlquilerVehiculos e) { System.out.printf("ERROR: %s%n%n",
		 * e.getMessage()); } } break;
		 * 
		 * case 9:// listar alquiler
		 * 
		 * System.out.println("\nListado de Alquiler");
		 * System.out.println("---------------------"); for (Alquiler alquiler :
		 * miAlquiler.getAlquileres()) { if (alquiler != null)
		 * System.out.println(alquiler); } System.out.println(""); break; default:
		 * break; } } while (opcion != 0);
		 */
	}
}
