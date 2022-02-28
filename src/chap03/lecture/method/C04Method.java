package chap03.lecture.method;

public class C04Method {
	public static void main(String[] args) {
		myMethod1(3, 5); // 파라미터의 작성 수와 동일하게 넣어줘야함
//		myMethod1(3); // x
//		myMethod1(); // x
		myMethod1(33, 55);
		myMethod1('가', 33);

		myMethod2(3, 5);
		myMethod2(33, 55);
		myMethod2('가', 33);
	}

	public static void myMethod1(int i, int j) {
		System.out.println(i);
		System.out.println(j);
	}

	// 파라미터명 : lowerCamelCase
	public static void myMethod2(int age, int height) {
		System.out.println(age * 2);
		System.out.println(height * 2);
	}
	
	public static void myMethod3(int i, boolean b, long l, double d) {
		System.out.println(i);
		System.out.println(b);
		System.out.println(l);
		System.out.println(d);
	}
}
