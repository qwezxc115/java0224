package chap03.lecture.method;

public class C03Method {
	public static void main(String[] args) {
		myMethod1(300);
		myMethod1(900);
//		myMethod1(3.14); // x : type error
		myMethod1('가'); // 자동 형 변환
		
		int j = 999;
		myMethod1(j);
		
	}
	public static void myMethod1(int i) {
		System.out.println(i);
	}
}
