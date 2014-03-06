package de.inovex.academy.csd.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GroupTest {

	@Test
	public void testAdd() {
		Group group = new Group();
		User user = new User();
		group.add(user);
		assertEquals(user, group.get(0));
	}
}
