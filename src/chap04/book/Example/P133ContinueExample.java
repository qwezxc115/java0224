package chap04.book.Example;

public class P133ContinueExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
	}
}
