package hackerrankchallenges.ProblemSolving;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class EqualizeTheArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = equalizeArray(arr);

        System.out.println(result);

        scanner.close();
    }

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {

        int result = 0;

        HashMap<Integer, Integer> line = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            if (line.containsKey(arr[i])){
                line.put(arr[i], line.get(arr[i]) + 1);
            } else
                line.put(arr[i], 1);
        }

        result = arr.length - Collections.max(line.values());

        return result;
    }
}
