package JavaSe.IZ0808.Part1;

public class Soal067 {
	public static void main(String[] args) {
        String [] fruits = {"apple", "banana", "mango", "orange"};
        for(String fruit : fruits) {
            System.out.print(fruit + " ");
            if(fruit.equals("mango")) {
                continue;
            }
            System.out.println("salad!");
            break;
        }        
    }
}
