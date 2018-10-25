package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class BirthdayCakeCandles {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = 0;
        int biggest = 0;

        for (int arItr = 0; arItr < arCount; arItr++){

            if (biggest < ar[arItr]){
                biggest = ar[arItr];
                result = 1;
            } else if (ar[arItr] == biggest) result ++;
        }
        System.out.println(result);
    }
}