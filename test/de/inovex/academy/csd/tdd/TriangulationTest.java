package de.inovex.academy.csd.tdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TriangulationTest {

	@Test
	public void testVerifyNumber() {
		Triangulation triangulation = new Triangulation();
		assertTrue(triangulation.verifyNumber("1234"));
		assertTrue(triangulation.verifyNumber("12 34"));
		assertFalse(triangulation.verifyNumber(" "));
	}
}
