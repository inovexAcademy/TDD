package de.inovex.academy.csd.tdd;

import java.util.List;

public interface GenericListFactory {

	public <T> List<T> createList();
}
