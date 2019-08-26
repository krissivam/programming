package implementation;

public class DayOfTheProgrammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static String dayOfProgrammer(int tahun) {
		if( tahun == 1918 ) return "26.09.1918";
	    if( checktahun( tahun ) ) return "12.09." + Integer.toString( tahun );
	    else return "13.09." + Integer.toString( tahun );

	}

	static boolean checktahun( int tahun ) {

	    if( tahun % 4 != 0 ) return false;
	    if( tahun > 1918 && tahun % 100 == 0 && tahun % 400 != 0 ) return false;
	    return true;

	}
	

}
