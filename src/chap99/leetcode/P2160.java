package chap99.leetcode;

import java.util.Arrays;

public class P2160 {

	class Solution {
		public int minimumSum(int num) {
			int[] p = new int[4];

			for (int i = 0; i < p.length; i++) {
				p[i] = num % 10;
				num /= 10;
			}

			Arrays.sort(p);

			int num1 = p[0] * 10 + p[2];
			int num2 = p[1] * 10 + p[3];
			return num1 + num2;
		}
	}
}
