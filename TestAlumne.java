import static org.junit.Assert.*;
import static org.junit.Assert.*;

import org.junit.*;

public class TestAlumne {

	private Alumne al1;
	private Alumne al2;
	private Alumne al3;
	
	@Before
	public void setUp() throws Exception {
	 al1 = new Alumne ("Pepito", 18, 2017, 6, 6);
	 al2 = new Alumne ("Pepita", 25, 2015, 8, 9);
	 al3 = new Alumne ("Pepote", 16, 2015, 8, 9);
	}
	
	
	@Test
	public void testEsMajorEdat() {
		assertTrue("Pepita deberia ser mayor de edad", al2.esMajorEdat());
		assertTrue("Pepito deberia ser mayor de edad", al1.esMajorEdat());
		assertFalse("Pepote no deberia ser mayor de edad", al3.esMajorEdat());
		
	}

	@Test
	public void testAprovaM5() {
		assertTrue("Pepita deberia estar aprobada", al2.aprovaM5(100));
		assertTrue("Pepito deberia estar aprobado", al1.aprovaM5(80));
		
		assertFalse("Pepita no deberia estar aprobada", al2.aprovaM5(20));
		assertFalse("Pepito no deberia esta aprobado", al1.aprovaM5(45));
	}

	@Test
	public void testAnysMatriculat() {
		assertEquals("Deberia ser 0", 0, al1.anysMatriculat(2017));
		assertEquals("Deberia ser 2", 2, al2.anysMatriculat(2017));
		
		assertNotEquals("No deberia ser 10", 10, al1.anysMatriculat(2012));
		
	}
	
	@Test
	public void testPassaASegon() {
		assertTrue("Pepita deberia pasar a segundo", al2.passaASegon());
		assertFalse("Pepito no deberia pasar a segundo", al1.passaASegon());
	}

}
