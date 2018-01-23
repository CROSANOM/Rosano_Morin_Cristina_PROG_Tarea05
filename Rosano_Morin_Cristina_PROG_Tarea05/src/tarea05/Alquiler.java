package tarea05;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;

/**
 * @author crosanom
 *
 */

// punto13 crear la clase Alquiler con sus atributos.

public class Alquiler {

	private Date fecha;
	private int dias, MS_DIA;
	private final SimpleDateFormat FORMATO_FECHA = new SimpleDateFormat("dd/MM/yyyy");// incialiazaci�n del objeto
	private final double PRECIO_DIA = 0;

	// declarar atributo Cliente cliente Turismo turismo para la clase Alquiler
	private Cliente cliente;
	private Turismo turismo;

	// punto14 crear un constructor clase Alquiler con Cliente Turismo como
	// parametros

	public Alquiler(Cliente cliente, Turismo turismo) {
		// como inicializar los atributos de otra clase ;
		this.cliente = cliente;
		this.turismo = turismo;

		// turismo.setDisponibilidad(false);

	}

	// punto15 crear los m�todos get para los atributos de la clase Alquiler
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

	/*
	 * punto16 Crea un m�todo close que cerrar� el alquiler, para lo que partiendo
	 * de la fecha actual y la fecha en que se realiz� el alquiler, calcule el
	 * n�mero de d�as -si se devuelve el mismo d�a contar� como 1 d�a- y ponga el
	 * turismo como disponible. Para ello crea un m�todo privado llamado difDias y
	 * que devuelva la diferencia en d�as entre dos fechas y luego utilizalo en el
	 * m�todo close
	 */

	// metodoDifDias

	int diferenciaDias = 0; // decl�ra de manera global para que no chille y se pueda usar en
							// metodoGetPrecio

	private int diferenciaDias(SimpleDateFormat FORMATO_FECHAsalida, SimpleDateFormat FORMATO_FECHA_entrada) {

		return diferenciaDias;
	}

	// Metodo calcule el precio total ( 30 euros * Ndias + cilindra/100 )

	public double getPrecio(double PRECIO_DIA, int dias, Turismo cilindrada) { // parametros del getPrecio

		// instanciar una cilindrada

		double precioTotal = ((PRECIO_DIA * diferenciaDias) + turismo.getCilindrada() / 100);

		return precioTotal;
	}

	// Punto18 Crear un m�todo llamado toString y que devuelva un String que ser� la
	// representaci�n del alquiler

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Alquiler [fecha=" + fecha + ", dias=" + dias + ", MS_DIA=" + MS_DIA + ", FORMATO_FECHA=" + FORMATO_FECHA
				+ ", PRECIO_DIA=" + PRECIO_DIA + ", cliente=" + cliente + ", turismo=" + turismo + ", diferenciaDias="
				+ diferenciaDias + ", getFecha()=" + getFecha() + ", getDias()=" + getDias() + ", getMS_DIA()="
				+ getMS_DIA() + ", getFORMATO_FECHA()=" + getFORMATO_FECHA() + ", getPRECIO_DIA()=" + getPRECIO_DIA()
				+ "]";
	}

}
