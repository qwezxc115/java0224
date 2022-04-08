package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App08 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list1.add(i);
		}
		System.out.println(list1);

		// 각 element를 2배값으로 변경
		//		List<Integer> list2 = new ArrayList<>();
		//		for (int i = 0; i < 10; i++) {
		//			list2.add(i*2);
		//		}
		//		System.out.println(list2);

		for (int i = 0; i < list1.size(); i++) {
			Integer origin = list1.get(i);
			list1.set(i, origin*2);
		}
		System.out.println(list1);
	}
}
