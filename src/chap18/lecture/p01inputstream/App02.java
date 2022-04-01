package chap18.lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class App02 {
	public static void main(String[] args) throws Exception {

		String path = "src/chap18/lecture/p01inputstream/App02.java";

		InputStream is = new FileInputStream(path);

		int read = 0;
		int cnt = 0;
		while ((read = is.read()) != -1) {
//			System.out.println(read);
			cnt++; // 이 주석을 제외하고 499번 read 메소드 실행됨
		}
		System.out.println(cnt);
	}
}
