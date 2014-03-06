package de.inovex.academy.csd.tdd;

public class Triangulation {

	public boolean verifyNumber(String input) {
		return input.matches("\\d(\\d|\\s)+");
	}

}
