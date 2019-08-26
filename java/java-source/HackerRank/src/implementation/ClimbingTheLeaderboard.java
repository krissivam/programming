package implementation;

import java.util.stream.IntStream;

public class ClimbingTheLeaderboard {
	// link
	// https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
	public static void main(String[] args) {
		int[] scores = new int[] {100, 100, 50, 40, 40, 20, 10};
		int[] alice = new int[] {5,25, 50, 120};
		int[] rank = new int[alice.length];
		int[] array = IntStream.of(scores).distinct().toArray();
		int index = array.length-1;
		int a =0;
		for(int score:alice) {
			while(index>=0) {
				if(score >=array[index]) {
					index--;
				}else {
					rank[a]=index+2;
					a++;
					break;
				}
			}
			if(index<0) {
				rank[a]=1;
				a++;
			}
		}
		
		System.out.println("result");
		for (int i = 0; i < rank.length; i++) {
			System.out.println(rank[i]);
		}
	}

}
