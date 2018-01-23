package tarea05;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 */

/**
 * @author crosanom
 *
 */

// punto 13 crear la clase Alquiler 

public class Alquiler {

	private Date fecha;
	private int dias , MS_DIA;
	private final SimpleDateFormat FORMATO_FECHA=new SimpleDateFormat("dd/MM/yyyy");// incialiazación del objeto 
	private final double PRECIO_DIA=0;
	
	// punto 14 crear un constructor clase Alquiler con Cliente Turismo como parametros 
	
public Alquiler (Cliente cliente, Turismo turismo) {
	// como inicializar los atributos de otra clase ;
	
	 cliente= cliente;
	 turismo=turismo;
	 //turismo.setDisponibilidad(false);
	 
	
}
	
// punto 15  metodos get and set 

	public Date getFecha() {
		return fecha;
	}

	public int getDias() {
		return dias;
	}

	public int getMS_DIA() {
		return MS_DIA;
	}

	public SimpleDateFormat getFORMATO_FECHA() {
		return getFORMATO_FECHA();
	}

	public double getPRECIO_DIA() {
		return PRECIO_DIA;
	}


	// 
	
	
	
	// punto 18 
	@Override
	public String toString() {
		return "Alquiler [fecha=" + fecha + ", dias=" + dias + ", MS_DIA=" + MS_DIA + ", FORMATO_FECHA=" + FORMATO_FECHA
				+ ", PRECIO_DIA=" + PRECIO_DIA + "]";
	}
	
	
	
	
	
}
