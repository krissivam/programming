package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.List;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class BonAppetit {
	// Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
    	int c = 0;
    	for (int i = 0; i < bill.size(); i++) {
			if(i!=k) {
				c=c+bill.get(i);
			}
		}
    	int s = c/2;
    	if(b-s <= 0) {
    		System.out.println("Bon Appetit");
    	}else {
    		System.out.println(b-s);
    	}
    	

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
