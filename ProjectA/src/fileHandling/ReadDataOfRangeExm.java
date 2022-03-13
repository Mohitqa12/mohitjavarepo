package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataOfRangeExm {

	public void readDataOfRange(String initial_rowno, String last_rowno) throws IOException {
		File fl = new File("../ProjectA/frist1.txt");
		FileReader fr = new FileReader(fl);
		BufferedReader br = new BufferedReader(fr);
		BufferedReader br1 = new BufferedReader(fr);

		while ((initial_rowno = br.readLine()) != null) {
			System.out.println(initial_rowno);
		}
		while ((last_rowno = br1.readLine()) != null) {
			System.out.println(last_rowno);
		}
	}

	public static void main(String[] args) throws IOException {

		ReadDataOfRangeExm rd = new ReadDataOfRangeExm();
		rd.readDataOfRange("a", "b");
	}

}
