package chap03.book.Example;

public class P73DenyLogicOperatorExample {
	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play); // true
		
		play = !play;
		System.out.println(play); //false
		
		play = !play;
		System.out.println(play); // true
	}
}
