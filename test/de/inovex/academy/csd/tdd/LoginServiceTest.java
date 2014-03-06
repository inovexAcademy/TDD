package de.inovex.academy.csd.tdd;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class LoginServiceTest {

	@Test
	public void testLogin() {
		LoginService loginService = new LoginService();

		Session session = loginService.login("admin", "test1234");
		assertNotNull("user 'admin' should be able to log in", session);
		session = loginService.login("collin", "test1234");
		assertNull("user 'collin' should not be able to log in", session);
	}
}
