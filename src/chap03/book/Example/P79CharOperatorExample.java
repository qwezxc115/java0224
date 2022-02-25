package chap03.book.Example;

public class P79CharOperatorExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2 + c1; // 컴파일 에러 - (char)를 붙여주면 됨
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
//		System.out.println("c3: " + c3);
		
	}
}
