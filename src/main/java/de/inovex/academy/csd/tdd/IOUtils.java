package de.inovex.academy.csd.tdd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOUtils {
	public String slurp(FileReader fileReader) throws IOException {
		BufferedReader reader = new BufferedReader(fileReader);
		StringBuilder content = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			content.append(line);
		}

		return content.toString();
	}
}
