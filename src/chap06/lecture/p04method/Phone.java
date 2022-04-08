package chap06.lecture.p04method;

public class Phone {
	// method overloading : method명이 같은 메소드르 여러개만듬
	// 같은 메소드명을 가져도
	// 파라미터의 타입, 개수, 순서로 구분
	
	// *참고: 7장에서 나오는 용어 method overriding과 용어가 비슷해서
	// 면접에서 자주 물어봄
	void call(String name) {
		System.out.println(name + " 에게 발신");
	}

	void call(int num) {
		System.out.println(num + "로 발신");
	}

	void call(String name, int num) {

	}

	void call(int num, String name) {

	}
}
