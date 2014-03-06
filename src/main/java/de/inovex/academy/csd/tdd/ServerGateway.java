package de.inovex.academy.csd.tdd;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class ServerGateway {
	private HTTPClient httpClient;

	public void _getFile(String id) throws MalformedURLException, UnsupportedEncodingException {
		httpClient.getURL(new URL("http://server.com/repository/" + URLEncoder.encode(id, "UTF-8")));
	}

	public void setFileServer(HTTPClient httpClient) {
		this.httpClient = httpClient;

	}

}
