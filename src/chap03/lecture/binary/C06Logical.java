package chap03.lecture.binary;

public class C06Logical {
	public static void main(String[] args) {
		// 논리연산자
		// &&(AND short circuit), ||(OR short circuit)
		// &(AND), |(OR), ^(XOR)
		// 피연산자 : boolean
		// 연산결과 : boolean

		// AND &&
		// 양변이 모두 true일 때만 true, 나머지 모두 false
		System.out.println("AND &&");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		// OR ||
		// 양변이 모두 false일 때만 false, 나머지 모두 true
		System.out.println("OR ||");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		// short circuit
		int i = 3;
		System.out.println((i > 0) && (i++ > 0)); // 연산을 함
		System.out.println(i);

		System.out.println((i < 0) && (i++ < 0)); // 이미 앞 false에서 연산 종료
		System.out.println(i);

		System.out.println((i < 0) || (i++ < 0));
		System.out.println(i);

		System.out.println((i > 0) || (i > 0)); // short circuit
		System.out.println(i);

		System.out.println((i > 0) & (i++ > 0));
		System.out.println(i);

		System.out.println((i < 0) & (i++ < 0)); // short circuit xxxx
		System.out.println(i);
		
		// ^ (XOR)
		// 양변이 다를 때만 true, 같으면 false
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
	}
}
