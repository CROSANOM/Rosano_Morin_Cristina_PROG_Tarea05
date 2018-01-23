package tarea05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// crear la clase cliente con los atributos y visibilidad adecuados 

public class Cliente {

	private String nombre, dni, direccion, localidad, codigoPostal;
	private int identificador;
	private static int numClientes = 0;

	// punto 6 ( crear un constructor Cliente con cinco par�metros)
	public Cliente(String nombre, String dni, String direccion, String localidad, String codigoPostal) {
		this.nombre = nombre;
		this.dni = dni;
		// hay que meter la condici�n con metodo compruebaDNi + excepci�n 
		this.direccion = direccion;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;

		// por cada cliente que creo se asigna un identificador

		numClientes++;
		identificador = numClientes;
	}

	// Punto 6 Crear constructor copia de Cliente

	public Cliente(Cliente cliente) {

		identificador = cliente.getIdentificador();
		nombre = cliente.getNombre();
		dni = cliente.getDni();
		direccion = cliente.getDireccion();
		localidad = cliente.getLocalidad();
		codigoPostal = cliente.getCodigoPostal();

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

	// Punto 7 Crear los m�todos get para cada uno de los atributos.

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * @return the codigoPostal
	 */
	public String getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * @return the numClientes
	 */
	public static int getNumClientes() {
		return numClientes;
	}
	// punto 8 Crear el m�todo toString que devuelva una representaci�n de nuestro
	// cliente

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", direccion=" + direccion + ", localidad=" + localidad
				+ ", codigoPostal=" + codigoPostal + ", identificador=" + identificador + "]";
	}

}
