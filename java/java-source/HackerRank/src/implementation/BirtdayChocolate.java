package implementation;

import java.util.List;

public class BirtdayChocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
    	int result = 0;
    	for (int i = m-1; i < s.size(); i++) {
    		int tmpD =0;
			for (int j = i; j >i-(m-1); j--) {
				tmpD +=s.get(j);
			}
			if(tmpD == d){
				result++;
			}
		}
    	return result;
    }

}
