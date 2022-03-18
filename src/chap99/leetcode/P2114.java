package chap99.leetcode;

public class P2114 {

	class Solution {
		public int mostWordsFound(String[] sentences) {
			int max = 0;

			for (int i = 0; i < sentences.length; i++) {
				int j = sentences[i].split(" ").length;
				max = Math.max(max, j);
			}
			return max;
		}
	}
}
