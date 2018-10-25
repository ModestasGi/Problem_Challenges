package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class BetweenTwoSets {

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int aSize = ui.nextInt();
        int bSize = ui.nextInt();
        int maxA = 0;
        int minB = 101;

        int[] aLine = new int[aSize];
        for(int i = 0; i < aSize; i++){
            int tmp = ui.nextInt();
            maxA = tmp > maxA ? tmp:maxA;
            aLine[i] = tmp;
        }
        int[] bLine = new int[bSize];
        for(int j = 0; j < bSize; j++){
            int tmp = ui.nextInt();
            minB = tmp < minB ? tmp:minB;
            bLine[j] = tmp;
        }

        int integersBetween = 0;

        intCheck:
        for(int i = maxA; i <= minB; i += maxA) {
            //Checking all A are as factor of i
            for(int num : aLine){
                if(i%num != 0){
                    continue intCheck;
                }
            }
            //Checking i is a factor of all B
            for(int num : bLine){
                if(num%i != 0){
                    continue intCheck;
                }
            }
            integersBetween++;
        }
        System.out.println(integersBetween);
    }
}
