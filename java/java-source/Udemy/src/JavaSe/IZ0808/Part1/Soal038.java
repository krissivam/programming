package JavaSe.IZ0808.Part1;

public class Soal038 {
	public static void main(String[] args) {
        int x = 1;
        while(checkAndIncrement(x)) {
            System.out.println(x);
        }
    }

    private static boolean checkAndIncrement(int x) {
        if(x < 5) {
            x++;
            return true;
        } else {
            return false;
        }
    }
}
