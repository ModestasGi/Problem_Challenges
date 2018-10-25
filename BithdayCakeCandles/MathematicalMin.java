package hackerrankchallenges.ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;
/**
 * additional for BirthdayCakeCandles if cleaned -> optimal solution
 *
 * */
public class MathematicalMin {

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int size = ui.nextInt();
        double[] arr = new double[size];
        for(int i = 0; i < size; i++){
            arr[i] = ui.nextDouble();
        }

        ui.close();
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(System.out::println); // to clean

        int q = 1;
        for(int i = size-2; i > -1; i--){
            if (arr[size - 1] == arr[i]){
                q = q + 1;
            }
        }
        System.out.println(q);
        System.out.println("number of candles: " + q + " length -> " + arr.length); // clean
        System.out.println("smallest: " + arr[0]); // clean
        System.out.println("biggest: " + arr[size -1]); // clean
    }
}