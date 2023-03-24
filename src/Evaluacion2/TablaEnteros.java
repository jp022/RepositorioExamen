package Evaluacion2;

/**
 * primera anotacion
 * @since 24/3/2023
 * @version 1.0
 * @author DAM-1
 *@see <a href="file:///C:/Users/DAM-1/Downloads/WorkspaceExamenJuan/evaluacion2/doc/Evaluacion2/TablaEnteros.html">Pagina de docimentacion</a>
 */
public class TablaEnteros {
	/**
	 * @since 24/3/2023
	 * @version 1.0
	 * @author DAM-1
	 *@return void
	 *@param tabla
	 */
	private Integer[] tabla;

	TablaEnteros(Integer[] tabla) {
		if (tabla == null || tabla.length == 0)
			throw new IllegalArgumentException("No hay elementos");
		this.tabla = tabla;
	}

	/**
	 * @since 24/3/2023
	 * @version 1.0
	 * @author DAM-1
	 *@return suma
	 */
	// devuelve la suma de los elementos de la tabla
	public int sumaTabla() {
		int suma = 0;
		for (int i = 0; i < tabla.length; i++)
			suma += tabla[i];
		return suma;
	}

	/**
	 * @since 24/3/2023
	 * @version 1.0
	 * @author DAM-1
	 *@return max
	 */
	// devuelve el mayor elemento de la tabla
	public int mayorTabla() {
		int max = -999;
		for (int i = 0; i < tabla.length; i++)
			if (tabla[i] > max)
				max = tabla[i];
		return max;
	}

	/**
	 * @since 24/3/2023
	 * @version 1.0
	 * @author DAM-1
	 *@return i
	 */
	// devuelve la posici�n de un elemento cuyo valor se pasa
	public int posicionTabla(int n) {
		for (int i = 0; i < tabla.length; i++)
			if (tabla[i] == n)
				return i;
		throw new java.util.NoSuchElementException("No existe: " + n);
	}
}//
