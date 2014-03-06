package de.inovex.academy.csd.tdd;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("rawtypes")
public class DependencyInjection {
	private final ListFactory listFactory;

	public DependencyInjection(ListFactory listFactory) {
		this.listFactory = listFactory;
	}

	public void state1() {
		ArrayList list = new ArrayList();
		list.ensureCapacity(1000);
		//...
	}

	@SuppressWarnings("unused")
	public void state2() {
		List list = new ArrayList();
		//...
	}

	@SuppressWarnings("unused")
	public void state3() {
		List list = listFactory.createList();
	}
}
