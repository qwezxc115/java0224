package chap99.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P287 {

	class Solution {
		public int findDuplicate(int[] nums) {
			Arrays.sort(nums);

			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] == nums[i + 1]) {
					return nums[i];
				}
			}
			return 0;
		}
	}

	public int findDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				return nums[i];
			} else {
				set.add(nums[i]);
			}
		}
		return 0;
	}

	public int findDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			if (!set.add(num)) {
				return num;
			}
		}
		return 0;
	}

}
