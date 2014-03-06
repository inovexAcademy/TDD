package de.inovex.academy.csd.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ObviousImplementationTest {

	@Test
	public void testSetName() {
		ObviousImplementation oi = new ObviousImplementation();
		oi.setName("Prof. Farnsworth");
		assertEquals("The set name should be returned by get", "Prof. Farnsworth", oi.getName());
	}
}
