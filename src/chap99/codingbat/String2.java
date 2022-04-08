package chap99.codingbat;

public class String2 {

	public boolean catDog(String str) {
		int cnt1 = 0;
		int cnt2 = 0;

		for (int i = 0; i < str.length() - 2; i++) {
			String sub = str.substring(i, i + 3);
			if (sub.equals("cat")) {
				cnt1++;
			} else if (sub.equals("dog")) {
				cnt2++;
			}
		}
		return cnt1 == cnt2;
	}

	public int countHi(String str) {
		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.equals("hi")) {
				count++;
			}
		}
		return count;
	}

	public String doubleChar(String str) {
		String c = "";
		for (int i = 0; i < str.length(); i++) {
			c += str.charAt(i);
			c += str.charAt(i);
		}
		return c;
	}
}
