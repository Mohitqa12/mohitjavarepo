package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExm {

	public static void main(String[] args) throws IOException {

		File f1 = new File("../ProjectA/frist.txt");

		FileReader f = new FileReader(f1);

		BufferedReader br = new BufferedReader(f);

		String s;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}

	}

}
