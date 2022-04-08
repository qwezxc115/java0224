package chap14.book.Example.p140302;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;

		fi = () -> {
			String str = "method Call1";
			System.out.println(str);
		};
		fi.method();

		fi = () -> {
			System.out.println("method call2");
		};
		fi.method();

		fi = () -> System.out.println("method call3");
		fi.method();
	}
}
