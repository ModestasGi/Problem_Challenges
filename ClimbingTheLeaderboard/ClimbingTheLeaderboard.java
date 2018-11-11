package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class ClimbingTheLeaderboard {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int aResult : result) {
            System.out.println(aResult);
        }

        scanner.close();
    }

    private static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] scoresInTableOfRanks = createTableOfRanksFromScores(scores);
        int[] result = new int[alice.length];
        for (int i = 0; i < alice.length; i++){
            int lower = 0;
            int upper = scores.length - 1;
            int aliceRanking = 1;
            while (lower <= upper) {
                int middle = (lower + upper) / 2;
                if (alice[i] == scores[middle]) {
                    aliceRanking = scoresInTableOfRanks[middle];
                    break;
                } else if (alice[i] < scores[middle]) {
                    aliceRanking = scoresInTableOfRanks[middle] + 1;
                    lower = middle + 1;
                } else {
                    upper = middle - 1;
                }
            }
            result[i] = aliceRanking;
        }
        return result;
    }

    private static int[] createTableOfRanksFromScores(int[] scores) {
        int[] ranking = new int[scores.length];
        int x = 1;
        for (int i = 0; i < ranking.length; i++) {
            if (i > 0 && scores[i] != scores[i - 1]) {
                x++;
            }
            ranking[i] = x;
        }
        return ranking;
    }
}
