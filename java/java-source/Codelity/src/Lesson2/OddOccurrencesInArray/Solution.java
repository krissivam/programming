package Lesson2.OddOccurrencesInArray;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }));
	}

	public static int solution(int[] A) {
		int e = 0;
		for (int i = 0; i < A.length; i++) {
			e ^= A[i];
		}
		return e;
	}

	public static int solution2(int[] A) {
		HashSet<Integer> tmp = new HashSet<>();
		int e = -1;
		for (int i = 0; i < A.length; i++) {
			if (tmp.add(A[i])) {
				e = A[i];
			}
		}
		return e;
	}
	
	public static int solution3(int[] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if(A[i]==A[j] && i!=j) {
					A[i]=-1;
					A[j]=-1;
					j = A.length;
				}
			}
		}
		
		for (int i = 0; i < A.length; i++) {
			if(A[i]!= -1) {
				return A[i];
			}
		}
		return 0;
	}
	
	public static int solution4(int[] A) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			if(map.containsKey(A[i]) && map.get(A[i])==1) {
				map.remove(A[i]);
			}else {
				map.put(A[i], 1);
			}
		}
		
		for(Integer key : map.keySet()) {
			return key;
		}
		return 0;
	}

}
