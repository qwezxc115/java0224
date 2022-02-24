package chap02.book;

public class P46LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
//		long var3 = 10000000000000; // 컴파일 에러 : 지정 범위를 넘음
		long var4 = 10000000000000L; // 지정범위를 넘은경우 뒤에 L을 붙여줌
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
