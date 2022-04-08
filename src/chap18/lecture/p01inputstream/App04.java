package chap18.lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class App04 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/p01inputstream/App04.java";
		
		InputStream is = new FileInputStream(path);
		
		byte[] datas = new byte[100];
		int len = 0;
		int size = 0;
		
		while ((len = is.read(datas)) != -1) {
			System.out.println(Arrays.toString(datas));
			size += len;
		}
		System.out.println(size);
	}
}
