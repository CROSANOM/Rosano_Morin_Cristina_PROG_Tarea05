package tarea05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

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
	private Cliente cliente;
	private Turismo turismo;

	// Usar los metodos de Date para Obtener fecha de sistema y segmentarlo a�o,
	// mes, dia
	// Calendar

	Calendar calendario = new GregorianCalendar(); // creamos un objeto calendarioGregoriano

	// punto14 crear un constructor clase Alquiler con Cliente Turismo como
	// parametros

	public Alquiler(Cliente cliente, Turismo turismo) {
		this.cliente = cliente;
		this.turismo = turismo;
		this.fecha = new Date();// Inicializa la fecha a la fecha actual
		this.dias = 0; // inicializa los dias a cero
		this.turismo.setDisponibilidad(false); // inicializa la disponibilidad a false

	}

	// punto15 crear los m�todos get para los atributos de la clase Alquiler
	/**
	 * @return the fecha
	 */
	public Date getFecha() { // obtenemos la fecha del sistema porque fecha guarda esa informaci�n
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

	// metodo para DifDias url
	// https://github.com/Masqueprogramar/JavaBasico/blob/master/src/com/masqueprogramar/util/UtilesFecha.java

	int diferenciaDias = 0;

	private int diferenciaDiasEntreDosFechas(Date fechaAlquiler, Date fechaDevolucion) {
		long startTime = fechaAlquiler.getTime();
		long endTime = fechaDevolucion.getTime();
		long diffTime = endTime - startTime;
		diferenciaDias = (int) TimeUnit.DAYS.convert(diffTime, TimeUnit.MILLISECONDS);
		return (diferenciaDias); // se pasa el valor el metodo TimeUnit a diferenciaDias
	}

	// metodo Close Cierra Alquiler

	public void cerrar() {
		Date ahora = new Date();

		if (diferenciaDias == 0) { // condicion para ver numero de dias
			dias = +1;
		}

		else {
			dias = 1 + diferenciaDias;
		}

		this.turismo.setDisponibilidad(true); // pone turismo disponible

	}

	// Punto 17 GetPrecio Metodo calcule el precio total ( 30 euros * Ndias +
	// cilindra/100 )

	public double getPrecio(double PRECIO_DIA, int dias, Turismo cilindrada) { // parametros del getPrecio

		// instanciar una cilindrada

		double precioTotal = ((PRECIO_DIA * diferenciaDias) + turismo.getCilindrada() / 100);

		return precioTotal;
	}

	// Punto18 Crear un m�todo llamado toString y que devuelva un String que ser� la
	// representaci�n del alquiler.

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Alquiler [fecha=" + fecha + ", dias=" + dias + ", MS_DIA=" + MS_DIA + ", FORMATO_FECHA=" + FORMATO_FECHA
				+ ", PRECIO_DIA=" + PRECIO_DIA + ", cliente=" + cliente + ", turismo=" + turismo + "]";
	}

}
