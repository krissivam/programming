package implementation;

public class BreakingTheRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
    	int[] result = new int[2];
    	int minV=scores[0]; int minC =0 ;
    	int maxV=scores[0]; int maxC =0;
    	for (int i = 1; i < scores.length; i++) {
			if(scores[i]<minV) {
				minC++;
				minV=scores[i];
			}
			if(scores[i] > maxV) {
				maxC++;
				maxV=scores[i];
			}
		}
    	
    	result[0]=maxC;
    	result[1]=minC;
    	
    	return result;
    }

}
