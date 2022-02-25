package chap03.book.Example;

public class P71IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;

		System.out.println("----------------------");
		x++; // 11
		++x; // 11
		System.out.println("x = " + x); // 12
		
		System.out.println("----------------------");
		y--; // 9
		--y; // 9
		System.out.println("y = " + y); // 8
		
		System.out.println("----------------------");
		z = x++; // 12
		System.out.println("z = " + z); // 12
		System.out.println("x = " + x); // 13

		System.out.println("----------------------");
		z = ++x; // 13
		System.out.println("z = " + z); // 14
		System.out.println("x = " + x); // 14
		
		System.out.println("----------------------");
		z = ++x + y++; // 23
		System.out.println("z = " + z); // 23
		System.out.println("x = " + x); // 15
		System.out.println("y = " + y); // 9

	}
}
