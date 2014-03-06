package de.inovex.academy.csd.tdd;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import de.inovex.academy.csd.tdd.natural.NaturalComparator;

public class NaturalSortTest {

	@Test
	public void testSimpleStrings() {
		String[] strings = new String[] { "abd", "abc" };
		String[] sorted = new String[] { "abc", "abd" };
		Arrays.sort(strings, new NaturalComparator());
		assertArrayEquals(strings, sorted);
	}

	private void assertArrayEquals(String[] strings, String[] sorted) {
		assertEquals(Arrays.asList(sorted), Arrays.asList(strings));
	}
}
