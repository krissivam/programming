package day03;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {

	public static void main(String[] args) {
		List<Integer> aa = new ArrayList<>();
		aa.add(5);
		aa.add(6);
		aa.add(7);
		
		List<Integer> bb = new ArrayList<>();
		bb.add(5);
		bb.add(6);
		bb.add(7);
		int[][] abc = new int[10][20];
		int a = abc[0].length;
		
		List<Integer> result = compareTriplets(aa, bb);
		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) +"\t");
		}
	}
	
	 // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(0);
        Integer ra =0;
        Integer rb=0;
        for(int i =0; i< a.size(); i++){
            if(a.get(i) > b.get(0)){
                ra=ra+1;
                list.set(0, ra);
            }else if(a.get(i) < b.get(i)){
                rb=rb+1;
                list.set(1, rb);
            }
        }
        return list;

    }

}
