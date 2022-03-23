package chap99.codingbat;

public class Warmup1 {

	public int close10(int a, int b) {
		int adiff = Math.abs(a - 10);
		int bdiff = Math.abs(b - 10);

		if (adiff < bdiff) {
			return a;
		} else if (bdiff < adiff) {
			return b;
		} else {
			return 0;
		}
	}

	public boolean posNeg(int a, int b, boolean negative) {
		if (negative) {
			return a < 0 && b < 0;
		} else {
			return (a * b) < 0;
		}
	}

	public boolean nearHundred(int n) {
		if (n >= 90 && n <= 110) {
			return true;
		} else if (n >= 190 && n <= 210) {
			return true;
		} else {
			return false;
		}
	}

	public boolean makes10(int a, int b) {

		int sum = a + b;

		return (sum == 10) || (a == 10) || (b == 10);
	}

	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && (hour < 7 || hour > 20);
	}

	public int diff21(int n) {
		int diff = 21 - n;
		return (diff < 0) ? diff * -2 : diff;
	}

	public int sumDouble(int a, int b) {
		int sum = a + b;

		return (a == b) ? sum * 2 : sum;
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return !(aSmile ^ bSmile);
	}

	public boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}
}
