package chap99.leetcode;

import java.util.ArrayList;
import java.util.List;

public class P1431 {
	
	class Solution {
		public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
			ArrayList<Boolean> list = new ArrayList<>();

			int max = 0;
			for (int i : candies) {
				max = Math.max(max, i);
			}

			for (int candy : candies) {
				int result = candy + extraCandies;

				if (result >= max) {
					list.add(true);
				} else {
					list.add(false);
				}
			}
			return list;
		}
	}
}
