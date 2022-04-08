package chap06.book.s061302.package2;

import chap06.book.s061302.package1.A;

public class C {
	// 필드
	A s1 = new A(true); // o
	A a2 = new A(1); // x -- 같은 패키지에서만 가능
	A a3 = new A("문자열"); // x -- 같은 클래스에서만 가능
}
