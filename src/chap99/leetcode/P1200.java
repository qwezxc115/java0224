package chap99.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1200 {

	class Solution {
		public List<List<Integer>> minimumAbsDifference(int[] arr) {
			List<List<Integer>> result = new ArrayList<>();

			// 오름차순 정렬
			Arrays.sort(arr);

			// 최소값 구하기
			int min = arr[1] - arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				if (min > arr[i + 1] - arr[i]) {
					min = arr[i + 1] - arr[i];
				}
			}

			// 최소값과 일치하는 배열의 쌍 구하여 List에 넣기
			for (int i = 0; i < arr.length - 1; i++) {
				List<Integer> list = new ArrayList<>();
				if (arr[i + 1] - arr[i] == min) {
					list.add(arr[i]);
					list.add(arr[i + 1]);
					result.add(list);
				}
			}
			return result;
		}
	}
}
