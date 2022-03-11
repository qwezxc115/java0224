package chap06.lecture.p03constructor;

public class App05 {
	public static void main(String[] args) {

		String s1 = new String(); // 아무 값도 없음
		System.out.println(s1);

		String s2 = new String("java"); // java
		System.out.println(s2);

		String s3 = new String(new char[] { 's', 'q', 'l' });
		System.out.println(s3); // char 배열

		String s4 = new String(new byte[] { 65, 66, 67 });
		System.out.println(s4); // byte : 유니코드로 해석

		String s5 = new String(new char[] { 's', 'p', 'r', 'i', 'n', 'g' }, 2, 4);
		System.out.println(s5); // 2번부터 4개
	}
}
