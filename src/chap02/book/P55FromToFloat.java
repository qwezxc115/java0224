package chap02.book;

public class P55FromToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		// 123456780을 float로 변환시 정밀도 손실이 발생한다.
		// num3을 int로 변환시 원래 값을 얻을 수 없다.
		
		int result = num1 - num2;
		System.out.println(result);
	}
}
