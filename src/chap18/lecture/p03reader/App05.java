package chap18.lecture.p03reader;

import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

public class App05 {
	public static void main(String[] args) throws Exception {
		String name = "src/chap18/lecture/p03reader/App05.java";
		Reader rd = new FileReader(name);

		char[] datas = new char[10];
		int len = 0;

		while ((len = rd.read(datas)) != -1) {
			System.out.println(Arrays.toString(datas));
		}
	}
}

//텍스트데이터를파일에저장할대사용하는문자기반스트림이다