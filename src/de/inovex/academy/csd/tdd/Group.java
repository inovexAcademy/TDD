package de.inovex.academy.csd.tdd;

import java.util.List;
import java.util.Vector;

public class Group {
	private final List<User> users = new Vector<User>();

	public void add(User user) {
		users.add(user);
	}

	public User get(int i) {
		return users.get(i);
	}

}
