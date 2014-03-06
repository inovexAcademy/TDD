package de.inovex.academy.csd.tdd.natural;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class NaturalComparatorTest {
	private NaturalComparator comp;

	@Before
	public void setup() {
		comp = new NaturalComparator();
	}

	@Test
	public void testPureString() {
		assertEquals(expected("a", "b"), input("b", "a"));
	}

	@Test
	public void testPureNumbers() {
		assertEquals(expected("2", "11"), input("11", "2"));
	}

	@Test
	public void testStringAndNumber() {
		assertEquals(expected("a2", "a11"), input("a11", "a2"));
	}

	@Test
	public void testNumberAndString() {
		assertEquals(expected("2a", "11a"), input("11a", "2a"));
	}

	@Test
	public void testNumberStringNumber() {
		assertEquals(expected("2a2", "2a11"), input("2a11", "2a2"));
	}

	@Test
	public void testNumberWithDifferentLengths() {
		assertEquals(expected("a2b", "a11c"), input("a11c", "a2b"));
	}

	private List<String> input(String... strings) {
		List<String> list = expected(strings);
		Collections.sort(list, comp);

		return list;
	}

	private List<String> expected(String... strings) {
		List<String> list = new ArrayList<String>();
		for (String s : strings) {
			list.add(s);
		}

		return list;
	}

}
