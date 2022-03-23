package chap11.book.Exercise;

public class p11 {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;

		System.out.println(obj1 == obj2); // int값이 -128~127 값비교
		System.out.println(obj3 == obj4); // 127 초과로 참조값 비교
	}
}
