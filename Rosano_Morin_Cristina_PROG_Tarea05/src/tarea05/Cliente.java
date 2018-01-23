package tarea05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// crear la clase cliente con los atributos y visibilidad adecuados 

public class Cliente {

	private String nombre, dni, direccion, localidad, codigoPostal;
	private int identificador;
	private static int numClientes;

	// punto 6 ( crear un constructor Cliente con cinco parámetros)
	public Cliente(String nombre, String dni, String direccion, String localidad, String codigoPostal) {
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;

	}

	// crear metodos comprueba

	/* metodo privado comprueba dni */
	private boolean compruebaDni(String dni) {

		Pattern dniPatron = Pattern.compile("[0-9A-Z][0-9]{7}[A-Z]");
		Matcher emparejador = dniPatron.matcher((dni));
		if (emparejador.matches()) {
			System.out.println(" El dni es Correcto");

		} else {
			System.out.println("La matricula es incorrecta, lanzar excepcion");

		}
		return emparejador.matches();

	}

	/* metodo privado comprueba codigo postal */
	private boolean compruebaCodigoPostal(String codigoPostal) {
		/* expresionRegular */
		Pattern cpPatron = Pattern.compile("0[1-9][0-9]{3}|[1-4][0-9]{4}|5[0-2][0-9]{3}\n" + "\n" + "$");
		Matcher emparejador = cpPatron.matcher((codigoPostal));
		if (emparejador.matches()) {
			System.out.println(" El codigo Postal es Correcto");
		} else {
			System.out.println("El codigo Postal es Correcto");
		}

		return emparejador.matches();

	}

}
