package de.inovex.academy.csd.tdd;

import java.net.URL;
import java.util.List;

public class HTTPClientMock implements HTTPClient {
	private final List<String> trace;

	public HTTPClientMock(List<String> trace) {
		this.trace = trace;
	}

	@Override
	public String getURL(URL url) {
		trace.add("getFile:" + url);
		return null;
	}

}
