package chap06.lecture.p06final;

public class App01 {
	public static void main(String[] args) {
		
	// final : 변수 선언시 작성하면 값을 한번만 할당할 수 있음
	int i = 0;
	i = 3;
	
	final int j = 0;
//	j = 2; // xx
	
	final int k;
	k = 9;
//	k = 10; // xx 
	

	public static void method1(final int i) {
		i = 30; // xx
	}

}
