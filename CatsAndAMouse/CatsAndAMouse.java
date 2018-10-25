package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class CatsAndAMouse {

    public static void main(String[] args){

        Scanner ui = new Scanner(System.in);
        int numOfQueries = ui.nextInt();

        for (int i = 0; i < numOfQueries; i++){
            int catA = ui.nextInt();
            int catB = ui.nextInt();
            int mouse = ui.nextInt();

            System.out.println(catAndMouse(catA, catB, mouse));

        }
        ui.close();
    }

    private static String catAndMouse(int x, int y, int z){

        if (Math.abs(z-x) < Math.abs(z-y)){
            return "Cat A";
        } else if (Math.abs(z-x) > Math.abs(z-y)){
            return "Cat B";
        }
        return "Mouse C";
    }
}
