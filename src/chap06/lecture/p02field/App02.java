package chap06.lecture.p02field;

public class App02 {
	public static void main(String[] args) {
		Desk d1 = new Desk();
		Desk d2 = new Desk();
		
		System.out.println(d1.color);
		System.out.println(d1.heigth);
		System.out.println(d1.weight);

		System.out.println(d2.color);
		System.out.println(d2.heigth);
		System.out.println(d2.weight);
		
		d2.color = "red";
		System.out.println(d1.color);
		System.out.println(d2.color);
		
		Car c1 = new Car();
		System.out.println(c1.color);
		System.out.println(c1.speed);
		System.out.println(c1.model);
	}
}
