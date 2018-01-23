package tarea05;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author crosanom
 *
 */

// punto 13 crear la clase Alquiler con sus atributos

public class Alquiler {

	private Date fecha;
	private int dias, MS_DIA;
	private final SimpleDateFormat FORMATO_FECHA = new SimpleDateFormat("dd/MM/yyyy");// incialiazación del objeto
	private final double PRECIO_DIA = 0;

	// punto 14 crear un constructor clase Alquiler con Cliente Turismo como
	// parametros

	public Alquiler(Cliente cliente, Turismo turismo) {
		// como inicializar los atributos de otra clase ;

		cliente = cliente;
		turismo = turismo;
		// turismo.setDisponibilidad(false);

	}

}
