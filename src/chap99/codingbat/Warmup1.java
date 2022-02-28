package chap99.codingbat;

public class Warmup1 {

	public boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return !(aSmile ^ bSmile);
	}

	public int sumDouble(int a, int b) {
		int sum = a + b;
		return (a == b) ? sum * 2 : sum;
	}

	public int diff21(int n) {
		return (n <= 21) ? 21 - n : (n - 21) * 2;
	}

	public boolean parrotTrouble(boolean talking, int hour) {
		return (talking && ((hour <= 6) || (hour > 20)));
	}

	public boolean makes10(int a, int b) {
		return ((a == 10) || (b == 10) || (a + b == 10)) ? true : false;
	}
}
