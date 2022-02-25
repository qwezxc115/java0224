package chap03.book.Example;

public class P80OverflowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y; // (long)(x * y)
		System.out.println(z);
		
		long a = 1000000;
		long b = 1000000;
		long c = a * b;
		System.out.println(c);
	}
}
