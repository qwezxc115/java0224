package chap18.book.Exercise.p07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/book/Exercise/p07/AddLineNumberExample.java";
		String output = "output/Example07.txt";

		Reader rd = new FileReader(path);
		BufferedReader br = new BufferedReader(rd);

		Writer wt = new FileWriter(output);
		BufferedWriter bw = new BufferedWriter(wt);

		String line = "";
		int lineNumber = 1;

		while ((line = br.readLine()) != null) {
			System.out.println(lineNumber + ": " + line);
			lineNumber++;
		}

		wt.close();
		bw.close();
		br.close();
		rd.close();

	}
}
