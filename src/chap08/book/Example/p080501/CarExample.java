package chap08.book.Example.p080501;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.run();

		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();

		myCar.run();
	}
}
