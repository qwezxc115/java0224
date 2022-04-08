package chap05.lecture.reftype;

public class C01ReferenceType {
	public static void main(String[] args) {
		int i1;
		i1 = 3;
		
		String s1;
		s1 = "hello";
		
		int i2 = 5; // stack에 바로 저장됨
		String s2 = "java"; // 값은 heap에 저장되고 stack에는 주소 값이 저장됨
	}
}
