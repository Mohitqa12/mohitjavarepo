package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExm {

	public static void main(String[] args) throws IOException {

		File fl = new File("../ProjectA/frist1.txt"); // connection establish

		FileWriter f = new FileWriter(fl);

		f.write("i am mohit");  //single line
		
		//multiple line
		f.write("i am automation engineer"); 
		
		f.close(); // for savi ng and closing the file

	}

}
