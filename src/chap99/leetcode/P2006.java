package chap99.leetcode;

import java.util.HashMap;
import java.util.Map;

public class P2006 {

	class Solution {
		public int countKDifference(int[] nums, int k) {
			Map<Integer, Integer> map = new HashMap<>();
			int temp = 0;

			for (int i = 0; i < nums.length; i++) {
				if (map.containsKey(nums[i] - k)) {
					temp = map.get(nums[i] - k) + temp;
				}
				if (map.containsKey(nums[i] + k)) {
					temp = map.get(nums[i] + k) + temp;
				}
				map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
			}

			return temp;
		}
	}

	public int countKDifference(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {
			map.compute(num, (key, v) -> v == null ? 1 : v + 1);
		}

		int result = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer target = entry.getKey() + k;

			if (map.containsKey(target)) {
				result += entry.getValue() * map.get(target);
			}
		}

		return result;
	}
}
