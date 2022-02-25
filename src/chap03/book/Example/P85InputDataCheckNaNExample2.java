package chap03.book.Example;

public class P85InputDataCheckNaNExample2 {
	public static void main(String[] args) {
		String userInput = "NaN"; // 사용자로부터 입력 받은 값
		double val = Double.valueOf(userInput); // 입력값을 double 타입으로 변환

		double currentBalance = 10000.0;

		if (Double.isNaN(val)) { // NaN을 검사
			System.out.println("NaN이 입력되어 처리할 수 없음"); // NaN일 경우 실행되는 코드
			val = 0.0;
		}

		currentBalance += val; // currentBalance에 원래 값이 유지
		System.out.println(currentBalance);
	}
}