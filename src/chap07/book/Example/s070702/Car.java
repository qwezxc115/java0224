package chap07.book.Example.s070702;

public class Car {
	// 필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRigthTire = new Tire("뒤오른쪽", 4);

	// 생성자

	// 메소드
	// 모든 타이어를 1회 회전시키기 위해 각 Tire 객체의 roll() 메소드 호출
	// false를 리턴하는 roll()이 있을 경우 stop() 메소드를 호출하고 해당 타이어 번호를 리턴
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if (frontLeftTire.roll() == false) {
			stop();
			return 1;
		}

		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}

		if (backLeftTire.roll() == false) {
			stop();
			return 3;
		}

		if (backRigthTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	// 펑크 났을 때 실행
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
