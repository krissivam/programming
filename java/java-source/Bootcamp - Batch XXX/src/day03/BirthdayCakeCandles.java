package day03;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = birthdayCakeCandles(new int[]{3,2,1,3});
		System.out.println(f);
	}
	
	 // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int max= ar[0];
        for(int i=1; i< ar.length; i++){
            if(ar[i]>max)
                max=ar[i];
        }

        int cout = 0;
        for(int i=1; i< ar.length; i++){
            if(ar[i]==max){
                cout++;
            }            
        }
        return cout;
    }

}
