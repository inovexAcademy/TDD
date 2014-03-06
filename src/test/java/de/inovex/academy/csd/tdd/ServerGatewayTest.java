package de.inovex.academy.csd.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ServerGatewayTest {

	@Test
	public void _testGetFile() {
		List<String> trace = new ArrayList<String>();
		ServerGateway gateway = new ServerGateway();

		gateway.setFileServer(new HTTPClientMock(trace));
		try {
			gateway._getFile("Filename with blanks");
		} catch (MalformedURLException e) {
			fail();
		} catch (UnsupportedEncodingException e) {
			fail();
		}

		assertEquals(1, trace.size());
		assertEquals("getFile:http://server.com/repository/Filename+with+blanks", trace.get(0));
	}

}
