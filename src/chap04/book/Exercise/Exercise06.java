package chap04.book.Exercise;

public class Exercise06 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("출력 (끝에 enter 없이)");

		System.out.print("출력1");
		System.out.print("출력2");
		System.out.print("출력3");
		System.out.println();
	}
}
