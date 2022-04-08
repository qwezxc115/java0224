package chap18.lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class App06 {
	public static void main(String[] args) {
		// Exception

		String path = "picture/다형성01.png";

		InputStream is = null; // 초기화 시켜줌
		try {
			is = new FileInputStream(path);

			byte[] datas = new byte[100];
			int len = 0;
			int size = 0;

			while ((len = is.read(datas)) != -1) {
				System.out.println(Arrays.toString(datas));
				size += len;
			}
			System.out.println(size);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // 무조건 실행됨
			try {
				if (is != null) {
					is.close(); // 꼭 작성					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
