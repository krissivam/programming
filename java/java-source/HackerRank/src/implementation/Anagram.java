package implementation;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int anagram(String str) {
		if(str.length()%2 != 0)
            return -1;
        int ret = 0;
        int[] cArr = new int[26];
        for(int i=0; i<str.length()/2; i++)
            cArr[str.charAt(i) - 97]++; 
        for(int i=str.length()/2; i<str.length(); i++)
            cArr[str.charAt(i) - 97]--; 
        for(int val : cArr){
            ret += Math.abs(val);
        }
        return ret/2 ;
	}

}
