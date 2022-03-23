package chap99.leetcode;

public class P832 {

	class Solution {
		public int[][] flipAndInvertImage(int[][] image) {
			int[][] result = new int[image.length][image.length];

			for (int i = 0; i < image.length; i++) {
				for (int j = 0; j < image[i].length; j++) {
					result[i][j] = image[i][image.length - 1 - j];
					if (result[i][j] == 0) {
						result[i][j] = 1;
					} else if (result[i][j] == 1) {
						result[i][j] = 0;
					}
				}
			}
			return result;
		}
	}
}
