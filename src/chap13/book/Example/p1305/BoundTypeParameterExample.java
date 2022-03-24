package chap13.book.Example.p1305;

public class BoundTypeParameterExample {
	public static void main(String[] args) {
		//String str = Util.compare("a", "b"); xxxx
		
		int result1 = Util.Compare(10, 20); // auto boxing
		System.out.println(result1);
		
		int result2 = Util.Compare(4.5, 3); // auto boxing
		System.out.println(result2);
	}
}
