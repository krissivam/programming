package day03;

public class PlusMinus {

	public static void main(String[] args) {
		plusMinus(new int[]{-4, 3,-9, 0, 4, 1});

	}
	public static void plusMinus(int[] arr){
		double plus = 0;
		double neg =0;
		double zer =0;
        double result = 0;
        for(int i=0; i < arr.length; i++){
            if(arr[i]>0){
                plus++;
            }else if(arr[i]<0){
                neg++;
            }else{
                zer++;
            }
        }
        result =plus/arr.length;
        System.out.println(result);
        result =neg/arr.length;
        System.out.println(result);
        result =zer/arr.length;
        System.out.println(result);
	}

}
