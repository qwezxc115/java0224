package chap99.codingbat.Array2;

public class Array2 {

	public int[] shiftLeft(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			result[i] = nums[(i + 1) % nums.length]; // i+1 = 마지막 인덱스, 길이로 나눈 나머지는 0이므로 i에 0이 들어감
		}
		return result;
	}

	public boolean lucky13(int[] nums) {
		boolean has1 = false;
		boolean has3 = false;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				has1 = true;
			}

			if (nums[i] == 3) {
				has3 = true;
			}
		}

		return !has1 && !has3;
	}

	public boolean has22(int[] nums) {
		boolean is2 = true;
		boolean was2 = false;

		for (int i = 0; i < nums.length; i++) {

			is2 = nums[i] == 2;

			if (is2 && was2) {
				return true;
			}
			was2 = is2;
		}
		return false;
	}

	public int sum67(int[] nums) {
		int sum = 0;
		int i = 0;

		while (i < nums.length) {

			if (nums[i] == 6) {
				while (nums[i] != 7) {
					i++;
				}
			} else {
				sum += nums[i];
			}
			i++;
		}

		return sum;
	}

	public int sum13(int[] nums) {
		int sum = 0;
		boolean is13 = false;
		boolean was13 = false;

		for (int i = 0; i < nums.length; i++) {

			is13 = nums[i] == 13;

			if (!was13 && !is13) {
				sum += nums[i];
			}
			was13 = is13;
		}
		return sum;
	}

	public int centeredAverage(int[] nums) {
		int max = nums[0];
		int min = nums[0];
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
			if (min > nums[i]) {
				min = nums[i];
			}
			sum += nums[i];
		}
		return (sum - (max + min)) / (nums.length - 2);
	}

	public int bigDiff(int[] nums) {
		int max = nums[0];
		int min = nums[0];

		for (int num : nums) {
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		return max - min;
	}

	public int countEvens(int[] nums) {
		int cnt = 0;

		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] % 2) == 0) {
				cnt++;
			}
		}
		return cnt;
	}
}
