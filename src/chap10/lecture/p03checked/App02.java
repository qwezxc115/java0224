package chap10.lecture.p03checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App02 {
	public static void main(String[] args) {
		String s = "10";

		int i = Integer.parseInt(s);
		// NumberForamtException 발생 가능
		// NumberFormatException은 RuntiornException(unchecked exception)
		// 이어서 컴파일러가 검사안함

		try {
			FileReader fr = new FileReader("");
			// FileNotFoundException 발생 가능
			// FileNotFoundException은 RuntimeException을 상속받지 않았음
			// 그래서 컴파일러가 검사함
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
