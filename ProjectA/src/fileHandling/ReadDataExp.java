package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataExp {

	void readData(String row_no) throws IOException {
		File f1 = new File("../ProjectA/frist1.txt");

		FileReader fr = new FileReader(f1);
		BufferedReader bfr = new BufferedReader(fr);
		while ((row_no = bfr.readLine()) != null) {
		System.out.println(row_no);
		}
	}

	public static void main(String[] args) throws IOException {

		ReadDataExp r = new ReadDataExp();
		r.readData("j");
	}
}