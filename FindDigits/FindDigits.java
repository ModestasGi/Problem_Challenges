package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class FindDigits {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = findDigits(n);

            System.out.println(result);
        }
        scanner.close();
    }

    // Complete the findDigits function below.
    private static int findDigits(int n) {
        int r = 0;

        String number = String.valueOf(n);
        int [] sequenceOfn = new int[number.length()];
        for(int i = 0; i < number.length(); i++){
            sequenceOfn[i] = Character.digit(number.charAt(i), 10);
        }
        for(int j = 0; j < number.length(); j++){
            if(sequenceOfn[j] == 0){
                continue;
            }
            if (n%sequenceOfn[j] == 0){
                r++;
            }
        }
        return r;
    }
}
