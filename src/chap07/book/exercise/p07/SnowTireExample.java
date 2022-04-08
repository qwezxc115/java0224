package chap07.book.Exercise.p07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire; // Tire 재정의
		
		snowTire.run(); // 스노우 타이어
		tire.run(); // 스노우 타이어
	}
}
