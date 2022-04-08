package chap06.lecture.p04method;

public class App03 {
	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.execute("game");
		c1.execute("excel");
		
		c1.update("calculator");
		c1.update("windows");
		
		c1.add(3,5);
		c1.add(10, 20);
//		c1.add(3.14, 1.0); // int타입이므로 double타입은 받을 수 없음
		c1.add('c', 'a'); // int타입으로 자동변환
	}
}
