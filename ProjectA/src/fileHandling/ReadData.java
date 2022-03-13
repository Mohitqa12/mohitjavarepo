package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args) throws IOException {

		File fl = new File("../ProjectA/frist.txt");

		FileReader f = new FileReader(fl);

		int a;
		while ((a = f.read()) != -1) {
			System.out.println((char) a);
		}

	}

}
