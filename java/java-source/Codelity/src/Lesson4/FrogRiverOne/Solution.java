package Lesson4.FrogRiverOne;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(5, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }));
		System.out.println(solution(5, new int[] { 1, 3, 1, 4, 5, 3, 2, 5 }));
		System.out.println(solution(5, new int[] { 1, 3, 1, 4, 5, 3, 5, 2 }));
		System.out.println(solution(2, new int[] { 1, 1, 1, 2 }));
		System.out.println(solution(10, new int[] { 10, 2, 5, 6, 7, 1, 3, 4, 7, 9, 8, 10, 9, 10, 10 }));
		System.out.println(solution(10, randomFill(100, 10)));
	}
	
	public static int solution(int K, int[]A) {
		HashSet<Integer> fallen = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if(A[i]<=K) 
				fallen.add(A[i]);
			if(fallen.size()==K)
				return i;
		}
		return -1;
	}
	
	private static int[] randomFill(int n, int X) {
		int[] arr = new int[n];
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(X) + 1;
		}

		return arr;
	}

}
