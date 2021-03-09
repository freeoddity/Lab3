import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {
	private GradeBook g1;
	private GradeBook g2;
	@Before
	public void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(22.2);
		g1.addScore(56.7);
		
		g2 = new GradeBook(5);
		g2.addScore(98.5);
		g2.addScore(88.6);
		
	}

	@After
	public void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	public void testAddScore() {
		assertTrue(g1.toString().equals("22.2 56.7 "));
		assertTrue(g2.toString().equals("98.5 88.6 "));
	}

	@Test
	public void testSum() {
		assertEquals(78.9, g1.sum(), 0.0001);
		assertEquals(187.1, g2.sum(), 0.0001);
		
	}

	@Test
	public void testMinimum() {
		assertEquals(22.2, g1.minimum(), 0.001);
		assertEquals(88.6, g2.minimum(), 0.001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(56.7, g1.finalScore(), 0.0001);
		assertEquals(98.5, g2.finalScore(), 0.0001);
	}

	@Test
	public void testGetScoreSize() {
		assertTrue(g1.getScoreSize() == 2);
		assertTrue(g2.getScoreSize() == 2);
	}

	@Test
	public void testToString() {
		assertTrue(g1.toString().equals("22.2 56.7 "));
		assertTrue(g2.toString().equals("98.5 88.6 "));
	}

}
