package implementation;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTheTriplets {
	// Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        int ra =0;
        int rb=0;
        for(int i =0; i< a.size(); i++){
            if(a.get(i) > b.get(i)){
                ra++;
                list.set(0, ra);
            }else if(a.get(i) < b.get(i)){
                rb++;
                list.set(1, rb);
            }
        }
        return list;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
