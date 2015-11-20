package co.edu.udea.appempresariales;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanoTest {

	@Test
	public void test() {
		Romano romano = new Romano();
		String respuesta = romano.convertirARomano(987);
		assertEquals(respuesta, "CMLXXXVII");
	}

}
