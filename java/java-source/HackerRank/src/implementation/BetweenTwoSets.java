package implementation;

public class BetweenTwoSets {
	// https://www.hackerrank.com/challenges/between-two-sets/problem
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int getTotalX(int[] a, int[] b) {
		int x = 1, r = 0, j = 0, total = 0;
		int[] d = new int[101];
		for (x = 1; x < 101; x++) {
			int c = 0;
			for (int i = 0; i < a.length; i++) {
				if (x % a[i] == 0 && x >= a[i]) {
					c++;
				}
			}
			if (c == a.length) {
				d[j] = x;
				r++;
				j++;
			}
		}
		for (j = 0; j < r; j++) {
			int c = 0;
			for (int i = 0; i < b.length; i++) {
				if (b[i] % d[j] == 0) {
					c++;
				}
			}
			if (c == b.length) {
				total++;
			}
		}
		return total;
	}

}
