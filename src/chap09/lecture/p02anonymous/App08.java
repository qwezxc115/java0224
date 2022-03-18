package chap09.lecture.p02anonymous;

public class App08 {
	public static void main(String[] args) {

		//		o1.method1();
		otherMethod(new MyInterface1() {
			@Override
			public void method1() {
				System.out.println("마이인터페이스1 메소드 1 재정의");
			}
		});

		//		int[] arr1 = new int[] { 3, 4 };
		//		otherMethod2(arr1);
		otherMethod2(new int[] { 3, 4 });
	}

	public static void otherMethod(MyInterface1 param) {
		param.method1();
	}

	public static void otherMethod2(int[] arr) {

	}
}
