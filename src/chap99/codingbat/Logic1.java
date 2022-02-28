package chap99.codingbat;

public class Logic1 {
	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend) {
			return cigars >= 40;
		} else {
			return cigars >= 40 && cigars <= 60;
		}
	}

	
	public int dateFashion(int you, int date) {
		int result = 1;

		if (you >= 8 || date >= 8) {
			result = 2;
		}

		if (you <= 2 || date <= 2) {
			result = 0;
		}

		return result;

	}

	
	public boolean squirrelPlay(int temp, boolean isSummer) {
		if (isSummer) {
			return temp >= 60 && temp <= 100;
		} else {
			return temp >= 60 && temp <= 90;
		}
	}

	
	public int caughtSpeeding(int speed, boolean isBirthday) {
		int limit1 = 61;
		int limit2 = 81;

		if (isBirthday) {
			limit1 += 5;
			limit2 += 5;
		}

		if (speed >= limit2) {
			return 2;
		} else if (speed >= limit1) {
			return 1;
		} else {
			return 0;
		}
	}

	
	public int sortaSum(int a, int b) {
		if ((a + b >= 10) && (a + b <= 19)) {
			return 20;
		} else {
			return a + b;
		}
	}

	
//	public String alarmClock(int day, boolean vacation) {
//		if ((day >= 1 && day <= 5) && vacation == true) {
//			return "10:00";
//		} else if ((day == 0 || day == 6) && vacation == true) {
//			return "off";
//		} else if ((day >= 1 && day <= 5) && vacation == false) {
//			return "7:00";
//		} else {
//			return "10:00";
//		}
//	}
	
	public String alarmClock(int day, boolean vacation) {
		String early;
		String late;

		if (vacation) {
			early = "10:00";
			late = "off";
		} else {
			early = "7:00";
			late = "10:00";
		}

		String result = "";
		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			result = early;
			break;
		case 0:
		case 6:
			result = late;
		}

		return result;
	}
	
	
}
