package Lesson3.TapeEquilibrium;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solution(int[] A) {
		int total=0;
		for (int i = 0; i < A.length; i++) {
			total+=A[i];
		}
		
		int dif = Integer.MAX_VALUE;
		int prev = 0;
		int next = total;
		for (int i = 1; i < A.length; i++) {
			prev += A[i-1];
			next = total-prev;
			dif = Math.min(dif, Math.abs(prev-next));
		}
		return dif;
	}

}
