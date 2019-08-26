package day03;

public class MiniMaxSum {

	public static void main(String[] args) {
		miniMaxSum(new int[]{256741038,623958417,467905213,714532089,938071625});
	}
	// Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	long[] list = new long[arr.length];
        for(int i=0; i<arr.length; i++){
        	for (int j = 0; j < list.length; j++) {
				if(i!= j){
					list[i]=list[i]+arr[j];
				}
			}
        }
        long min =list[0];
        long max = list[0];
        for (int i = 1; i < list.length; i++) {
			if(list[i]<min){
				min = list[i];
			}
			
			if(list[i]>max){
				max = list[i];
			}
		}
        System.out.print(min +" "+ max);

    }

}
