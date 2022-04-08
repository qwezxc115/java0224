package chap14.book.Exercise;

import java.util.function.IntSupplier;

public class LambdaExample {
	public static int method(int x, int y) {
		IntSupplier supplier = () -> {
			x *= 10; // final 특성을 가지므로 변경할 수 없다.
			int result = x + y;
			return result;
		};
		int result = supplier.getAsInt();
		return result;
	}
}
