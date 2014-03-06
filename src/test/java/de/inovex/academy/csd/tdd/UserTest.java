package de.inovex.academy.csd.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class UserTest {
	@Test
	public void testConstructor() {
		User user = new User();
		assertNull("Initially a user should not have a firstname", user.getFirstname());
	}

	@Test
	public void testSetFirstname() {
		User user = new User();
		user.setFirstname("Donald");
		assertEquals("A user should have the given firstname", "Donald", user.getFirstname());
	}

}
