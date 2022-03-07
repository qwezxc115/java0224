package chap99.programers;

import java.util.Arrays;

public class Soultion12910 {

	public int[] solution(int[] arr, int divisor) {
		int[] answer = new int[arr.length];

		int i = 0;
		int j = 0;

		while (i < arr.length) {

			if ((arr[i] % divisor) == 0) {
				answer[j] = arr[i];
				j++;
			}

			i++;
		}

		if (j == 0) {
			return new int[] { -1 };
		}

		int[] answer2 = Arrays.copyOf(answer, j);

		Arrays.sort(answer2);

		return answer2;
	}
}
