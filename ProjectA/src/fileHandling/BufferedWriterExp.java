package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExp {

	public static void main(String[] args) throws IOException {

		File fl = new File("../ProjectA/frist1.txt");

		FileWriter fw = new FileWriter(fl, true);
		BufferedWriter b = new BufferedWriter(fw);

		b.newLine();
		b.write("i am mohit");
		b.newLine();
		b.write("gupta");

		b.close();

	}

}
