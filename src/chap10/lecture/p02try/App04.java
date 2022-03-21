package chap10.lecture.p02try;

public class App04 {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 3, 0 };
		
		try {
			int r = arr1[0] / arr1[2];
			
			System.out.println(r);
		} catch (NullPointerException e) {
			System.out.println("널포인터익셉션 발생");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 발생");
		} catch ( ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndxOutOfBoundsException 발생");
		}
		
		System.out.println("프로그램 실행 계속");
	}
}
