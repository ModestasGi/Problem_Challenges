package hackerrankchallenges.ProblemSolving;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CircularArrayRotation {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        int[] result = circularArrayRotation(a, k, queries);
        int[] secresult = circularArrayRotation1(a, k, queries);

        for (int i = 0; i < result.length; i++) {
            System.out.println(String.valueOf(result[i]));


            if (i != result.length - 1) {
                System.out.println("\n");
            }
        }
        System.out.println("Second method:");
        Arrays.stream(secresult).forEach(System.out::println);

        scanner.close();
    }

    // Complete the circularArrayRotation function below.
    private static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        // a -> integers, k -> rotation quantity, queries
        int[] result = new int[a.length];
        Integer[] arr = new Integer[a.length];
        for(int i = 0; i < a.length; i++){
            arr[i] = a[i];
        }
        Collections.rotate(Arrays.asList(arr), k);
        // Arrays.stream(arr).forEach(System.out::println);
        for (int i = 0; i < queries.length; i++){
            result[i] = arr[queries[i]];
        }
        return result;
    }

    private static int[] circularArrayRotation1(int[] a, int k, int[] queries){
        int[] result = new int[a.length];
        int[] fin = new int[queries.length];
        for(int i = 0; i <= a.length-1; i++){
            result[(i+k)%a.length] = a[i];
        }
        // Arrays.stream(result).forEach(System.out::println);
        for (int j = 0; j < queries.length; j++){
            fin[j] = result[queries[j]];
        }
        return fin;
    }
}
