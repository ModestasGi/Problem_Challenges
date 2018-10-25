package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class FormingMagicSquare {

    public static void main(String[] agrs){
        Scanner ui = new Scanner(System.in);
        int[][] s = new int[3][3];
        for (int i = 0; i < 3; i++){
             s[i][0] = ui.nextInt();
             s[i][1] = ui.nextInt();
             s[i][2] = ui.nextInt();
        }
        ui.close();

        System.out.println(formingMagicScuare(s));
    }
    private static int formingMagicScuare(int[][] s){
        int[][][] possOptions = {
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},

        };
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < 8; i++){
            int alteration = 0;
            for (int j = 0; j < 3; j++){
                for (int x = 0; x < 3; x++)
                    alteration += Math.abs(s[j][x] - possOptions[i][j][x]);
            }
            result = Math.min(result, alteration);
        }
        return result;
    }
}
