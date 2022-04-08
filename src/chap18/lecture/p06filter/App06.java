package chap18.lecture.p06filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class App06 {
	public static void main(String[] args) throws Exception {
		// BufferedReader, BufferedWriter 사용해서
		// output/FilterExample51.txt 를
		// output/FilterExample6.txt로 복사

		//		String input = "output/FilterExample51.txt";
		//		String output = "output/FilterExmaple6.txt";
		//
		//		InputStream is = new FileInputStream(input);
		//		InputStreamReader isr = new InputStreamReader(is);
		//		BufferedReader br = new BufferedReader(isr);
		//
		//		OutputStream os = new FileOutputStream(output);
		//		OutputStreamWriter osw = new OutputStreamWriter(os);
		//		BufferedWriter bw = new BufferedWriter(osw);
		//
		//		int data = 0;
		//
		//		long start = System.currentTimeMillis();
		//		while ((data = br.read()) != -1) {
		//			bw.write(data);
		//		}
		//		long end = System.currentTimeMillis();
		//
		//		System.out.println(end - start);
		//		bw.close();
		//		osw.close();
		//		br.close();
		//		isr.close();
		//
		//		System.out.println("복사 완료");

		copyNormal();
		copyBuffered();

	}

	private static void copyBuffered() throws Exception {
		String src = "output/FilterExample51.txt";
		String des = "output/FilterExample6.txt";

		Reader rd = new BufferedReader(new FileReader(src));
		Writer wr = new BufferedWriter(new FileWriter(des));

		int data = 0;

		long start = System.currentTimeMillis();
		while ((data = rd.read()) != -1) {
			wr.write(data);
		}
		long end = System.currentTimeMillis();

		System.out.println(end - start);

		wr.close();
		rd.close();

	}

	private static void copyNormal() throws Exception {
		String src = "output/FilterExample51.txt";
		String des = "output/FilterExample6.txt";

		Reader rd = new FileReader(src);
		Writer wr = new FileWriter(des);

		int data = 0;

		long start = System.currentTimeMillis();
		while ((data = rd.read()) != -1) {
			wr.write(data);
		}
		long end = System.currentTimeMillis();

		System.out.println(end - start);

		wr.close();
		rd.close();

	}
}
