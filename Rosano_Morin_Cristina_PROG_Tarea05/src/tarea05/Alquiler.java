package tarea05;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author crosanom
 *
 */

// punto13 crear la clase Alquiler con sus atributos.

public class Alquiler {

	private Date fecha;
	private int dias, MS_DIA;
	private final SimpleDateFormat FORMATO_FECHA = new SimpleDateFormat("dd/MM/yyyy");// incialiazación del objeto
	private final double PRECIO_DIA = 0;

	// punto14 crear un constructor clase Alquiler con Cliente Turismo como
	// parametros

	public Alquiler(Cliente cliente, Turismo turismo) {
		// como inicializar los atributos de otra clase ;

		cliente = cliente;
		turismo = turismo;
		// turismo.setDisponibilidad(false);

	}

	// punto15 crear los métodos get para los atributos.
	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @return the dias
	 */
	public int getDias() {
		return dias;
	}

	/**
	 * @return the mS_DIA
	 */
	public int getMS_DIA() {
		return MS_DIA;
	}

	/**
	 * @return the fORMATO_FECHA
	 */
	public SimpleDateFormat getFORMATO_FECHA() {
		return FORMATO_FECHA;
	}

	/**
	 * @return the pRECIO_DIA
	 */
	public double getPRECIO_DIA() {
		return PRECIO_DIA;
	}

}
