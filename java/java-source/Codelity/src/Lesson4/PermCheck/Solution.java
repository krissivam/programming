package Lesson4.PermCheck;

import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution1(new int[] { 4, 1, 3, 2 }));
		System.out.println(solution1(new int[] { 4, 1, 3 }));
		System.out.println(solution1(new int[] { 2, 1, 3 }));
		System.out.println(solution1(new int[] { 1, 1, 3 }));
		System.out.println(solution1(new int[] { 3, 2, 1 }));
		System.out.println(solution1(new int[] { 1 }));
		System.out.println(solution1(new int[] { 1 }));
		System.out.println(solution1(new int[] { 1000000000 }));
	}
	
	public static int solution1(int[] A) {
		boolean[] seen= new boolean[A.length+1];
		
		for (int i = 0; i < A.length; i++) {
			if(A[i] < 1 || A[i]>A.length) return 0;
			if(seen[A[i]]==true) return 0;
			else
				seen[A[i]]=true;
		}
		
		return 1;
	}
	
	public static int solution2(int[] A) {
		HashSet<Integer> seen = new HashSet<Integer>();
		
		for (int i = 0; i < A.length; i++) {
			if(seen.add(A[i])==false) return 0;
		}
		
		if(seen.size() != A.length) return 0;
		
		for (int i = 1; i < A.length; i++) {
			if(!seen.contains(i)) return 0;
		}
		
		return 1;
	}

}
