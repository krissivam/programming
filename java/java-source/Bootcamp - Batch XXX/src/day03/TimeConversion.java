package day03;

public class TimeConversion {

	public static void main(String[] args) {
		System.out.println(timeConversion("12:23:00AM"));

	}
	static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String am = s.substring(s.length()-2,s.length());
        int clock = Integer.parseInt(s.substring(0,2));
        String menit = s.substring(3,5);
        String detik = s.substring(6,8);
        
        if((am.equals("AM") || am.equals("am"))&& clock==12){
            clock = 0;
        }else if((am.equals("PM") || am.equals("pm"))&& clock < 12){
            clock = clock+12;
        }
        String result = String.format("%02d", clock)+":"+ menit +":"+ detik;

        return result;
    }

}
