package de.inovex.academy.csd.tdd;

import java.util.ArrayList;
import java.util.List;

public class UseGenericDependencyInjection {

	public void go() {
		GenericListFactory factory = new GenericListFactory() {

			@Override
			public <T> List<T> createList() {
				return new ArrayList<T>();
			}
		};

		@SuppressWarnings("unused")
		GenericDependencyInjection dependencyInjection = new GenericDependencyInjection(factory);
	}
}
