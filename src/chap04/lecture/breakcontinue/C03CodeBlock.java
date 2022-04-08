package chap04.lecture.breakcontinue;

public class C03CodeBlock {
	public static void main(String[] args) {

		// 조건문의 조건식이 1개일 경우 {}를 생략할 수 있지만
		// 항상 명시적으로 쓸 것
		if (false) {
			System.out.println("hello");
		}

		System.out.println("java");

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
