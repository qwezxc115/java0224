package chap02.book;

public class P54CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue; //int의 type을 char로 강제변경
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue; //long의 type을 int로 강제변경
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue; //double의 type을 int로 강제변경
		System.out.println(intValue);
	}
}
