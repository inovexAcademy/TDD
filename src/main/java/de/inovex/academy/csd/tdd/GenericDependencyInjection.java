package de.inovex.academy.csd.tdd;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("rawtypes")
public class GenericDependencyInjection {
	private final GenericListFactory listFactory;

	public GenericDependencyInjection(GenericListFactory listFactory) {
		this.listFactory = listFactory;
	}

	public void state1() {
		ArrayList<String> list = new ArrayList<String>();
		list.ensureCapacity(1000);
		//...
	}

	@SuppressWarnings("unused")
	public void state2() {
		List<String> list = new ArrayList<String>();
		//...
	}

	public void state3a(List list) {
		//...
	}

	@SuppressWarnings("unused")
	public void state3b() {
		List<String> list = listFactory.createList();
	}
}
