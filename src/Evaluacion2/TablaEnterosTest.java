
package Evaluacion2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class TablaEnterosTest {

	/**
	 * @throws java.lang.Exception
	 */
	
	@BeforeEach
	void setUp() throws Exception {
		
	}
	
	/**
	 * Test method for {@link Evaluacion2.TablaEnteros#sumaTabla()}.
	 */
	@Test
	void testSumaTabla(Integer[] tabla) {
		int esperado=(Integer) null;
		TablaEnteros tabla1 = new  TablaEnteros(tabla);
		assertequals(esperado, null);
	}


}
