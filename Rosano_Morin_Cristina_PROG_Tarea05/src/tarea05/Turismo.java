package tarea05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 */

/**
 * @author crosanom version1
 *
 */
// punto 9 crear la clase Turismo con sus atributos
public class Turismo {

	private String matricula, marca, modelo;
	private int cilindrada;
	private boolean disponibilidad;

	// punto 10 crear un constructor clase Turismo con 4 parametros ( matricula,
	// marca, modelo, cilindrada)
	/**
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param cilindrada
	 */
	public Turismo(String matricula, String marca, String modelo, int cilindrada) {

		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;

	}

	// Crear el metodo comprueba matricula

	/* metodo privado comprueba matricula */
	private boolean compruebaMatricula(String matricula) {

		Pattern matriculaPatron = Pattern.compile(" \"^([0-9]{4})([A-Z&&[^AEIOIU]]{3}$)\"");
		Matcher emparejador = matriculaPatron.matcher((matricula));
		if (emparejador.matches()) {
			System.out.println("La matricula  es Correcto");

		} else {
			System.out.println("La matricula es incorrecta ");

		}
		return emparejador.matches();

	}

}
