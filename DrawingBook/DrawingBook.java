package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class DrawingBook {

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int bookSize = ui.nextInt();
        int page = ui.nextInt();

        System.out.println(numberOfFlips(bookSize, page));
    }

    private static int numberOfFlips(int size, int p){

        int back = size;
        if(size%2 == 0){
            back = size + 1;
        }
        return Math.min(p/2, (back - p)/2);
    }
}
