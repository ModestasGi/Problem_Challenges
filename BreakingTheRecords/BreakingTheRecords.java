package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class BreakingTheRecords {

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int numberOfGames = ui.nextInt();

        int firstScoreasHighest = ui.nextInt();
        int lowestScore = firstScoreasHighest;
        int highRecordsBroken = 0;
        int lowRecordsBroken = 0;

        for(int i = 1; i < numberOfGames; i++){
            int score = ui.nextInt();
            if(score > firstScoreasHighest){
                firstScoreasHighest = score;
                highRecordsBroken++;
            }
            if(score < lowestScore){
                lowestScore = score;
                lowRecordsBroken++;
            }
        }
        System.out.println(highRecordsBroken + " " + lowRecordsBroken);
    }
}