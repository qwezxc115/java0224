package chap10.lecture.p02try;

public class App07 {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 0 };

		try {
			int r = arr1[0] / arr1[1];

			System.out.println(r);
			// | : 여러 익셉션을 잡고 싶을 때 사용
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("익셉션 발생");
		}
		// catch 블럭 여러개 작성시
		// 하위타입보다 상위타입을 아래에 작성

		System.out.println("프로그램 실행 계속");
	}
}
