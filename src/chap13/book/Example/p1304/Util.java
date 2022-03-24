package chap13.book.Example.p1304;

import chap13.book.Example.p1302.Box;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
