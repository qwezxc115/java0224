package chap03.lecture.method;

public class C06Method {
	public static void main(String[] args) {
		boolean a = flip(true);
		System.out.println(a);
		
		System.out.println(flip(false));
		
		System.out.println(makedouble(3));
		System.out.println(makedouble(9));
		System.out.println(sum(3, 5));
		System.out.println(sum(9, 1));
	}
	
	public static boolean flip(boolean b) {
		return !b;
	}
	
	public static int makedouble(int i) {
		return i * 2;
	}
	
	public static int sum(int i, int j) {
		return i + j;
	}
}
