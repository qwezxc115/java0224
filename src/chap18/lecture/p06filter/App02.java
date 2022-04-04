//한글추가
package chap18.lecture.p06filter;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class App02 {
	public static void main(String[] args) throws Exception {
		String file = "src/chap18/lecture/p06filter/App02.java";
		InputStream is = getInputStream(file);
		Reader isr = new InputStreamReader(is);

		int d1 = isr.read();
		int d2 = isr.read();
		int d3 = isr.read();
		int d4 = isr.read();

		System.out.println((char) d1);
		System.out.println((char) d2);
		System.out.println((char) d3);
		System.out.println((char) d4);

	}

	private static InputStream getInputStream(String filename) throws Exception {
		InputStream is = new FileInputStream(filename);

		return is;
	}
}
