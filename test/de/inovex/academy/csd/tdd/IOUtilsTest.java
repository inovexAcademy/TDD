package de.inovex.academy.csd.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

import org.junit.Test;

public class IOUtilsTest {

	@Test
	public void testSlurp() {
		IOUtils ioUtils = new IOUtils();
		try {
			String content = ioUtils.slurp(new FileReader("file.txt"));
			assertEquals("Zeile1Zeile2", content);
		} catch (IOException e) {
			fail();
		}
	}

	@Test
	public void _testSlurpWithBrokenFile() {
		IOUtils ioUtils = new IOUtils();
		FileReader fileReader = null;
		final AtomicBoolean wasClosed = new AtomicBoolean(false);
		try {
			fileReader = new FileReader("file.txt") {
				@Override
				public int read(char[] cbuf, int offset, int length) throws IOException {
					throw new IOException("cannot read file");
				}

				@Override
				public void close() throws IOException {
					super.close();
					wasClosed.set(true);
				}
			};
			ioUtils.slurp(fileReader);
			fail();
		} catch (IOException e) {
			assertTrue(wasClosed.get());
		}
	}
}
