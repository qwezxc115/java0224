package chap02.lecture;

public class C07tyoeChar {
	public static void main(String[] args) {
		// 문자형 : char(2)
		
		char var1 = ' ';
//		char var2 = ''; // x
		char var3 = '\\';
		char var4 = 'a';
		char var5 = '가';
		char var6 = '나';
		char var7 = '\uac00'; // 가
		
		System.out.println(var7);
		
		int var8 = var7; // 내부적으로 숫자여서 숫자로도 출력가능
		System.out.println(var8);
	}
}
