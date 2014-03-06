package de.inovex.academy.csd.tdd.natural;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NaturalComparator implements Comparator<String> {

	private static final Pattern pattern = Pattern.compile("(\\d+|[^\\d]+)");

	@Override
	public int compare(String s1, String s2) {
		List<String> elements1 = extractElementsFromString(s1);
		List<String> elements2 = extractElementsFromString(s2);
		return compareElements(elements1, elements2);
	}

	private int compareElements(List<String> e1, List<String> e2) {
		for (int i = 0; i < e1.size(); i++) {
			try {
				int comparison = compareNumbers(e1.get(i), e2.get(i));
				if (comparison != 0) {
					return comparison;
				}
			} catch (NumberFormatException e) {
				int comparison = e1.get(i).compareTo(e2.get(i));
				if (comparison != 0) {
					return comparison;
				}
			}

		}

		return 0;
	}

	private List<String> extractElementsFromString(String s1) {
		List<String> elements = new ArrayList<String>();
		Matcher matcher = pattern.matcher(s1);
		while (matcher.find()) {
			elements.add(matcher.group(1));
		}
		return elements;
	}

	private int compareNumbers(String s1, String s2) {
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);

		if (i1 < i2) {
			return -1;
		} else if (i1 > i2) {
			return 1;
		} else {
			return 0;
		}
	}

}
