package chap06.book.s060803;

public class Calculator {
	int plus(int x, int y) { // 1
		int result = x + y;
		return result;
	}

	double avg(int x, int y) { // 2
		double sum = plus(x, y); // 1 호출
		double result = sum / 2;
		return result;
	}

	void execute() {
		double result = avg(7, 10); // 2 호출
		println("실행결과: " + result); // 3
	}

	void println(String message) { // 3 호출
		System.out.println(message);
	}
}
