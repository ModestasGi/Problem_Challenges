package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MigratoryBirds2 {

    private static int typeOfBirds = 6;
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);

        int n = ui.nextInt();
        int[] types = new int[n];
        for (int i = 0; i < types.length; i++) {
            types[i] = ui.nextInt();
        }
        System.out.println(migratoryBirds(types));

        ui.close();
    }

    private static int migratoryBirds(int[] types){
        int[] c = new int[typeOfBirds];
        for (int type : types) {
            c[type]++;
        }

        int maxCount = IntStream.range(1, c.length).map(i -> c[i]).max().getAsInt();
        for (int i = 1;; i++) {
            if (c[i] == maxCount) {
                return i;
            }
        }
    }

}
