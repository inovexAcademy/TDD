package de.inovex.academy.csd.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FakeItTest {

	@Test
	public void testToString() {
		FakeIt fakeIt = new FakeIt("Roger Wilco");
		assertEquals("toString should use the given name", "Roger Wilco", fakeIt.toString());
	}

}
