package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        System.out.println(String.valueOf(result));

        scanner.close();
    }

    // Complete the beautifulDays function below.
    private static int beautifulDays(int i, int j, int k) {
        int number = 0;
        int minus;
        double fin;
        while (i <= j){
            minus = (i - reverseNumber(i));
            fin = (double)minus/(double)k;
            if(wholeNumberSearch(fin)){
                number++;
            }
            i++;
        }
        return number;
    }

    private static int reverseNumber(int initial){
        int rev = 0;

        while(initial != 0) {
            rev = rev * 10;
            rev = rev + initial%10;
            initial = initial/10;
        }
        return rev;
    }
    private static boolean wholeNumberSearch(double num){
        return num - Math.floor(num) == 0;
    }
}
