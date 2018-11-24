package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class Encryption {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String s = scanner.nextLine();

        System.out.println(encryption(s));


        scanner.close();
    }

    // Complete the encryption function below.
    private static String encryption(String s) {
        StringBuilder result = new StringBuilder();
        //First we determine the rows since they are <= the columns
        int rows = (int) Math.sqrt(s.length());

        //Expand the columns if the sentence doesn't fit in a square matrix
        int columns = (s.length() > rows * rows) ? rows + 1 : rows;

        //Expand the rows if the sentence still doesn't fit
        rows = (s.length() > rows * columns) ? rows + 1 : rows;

        //System.out.println(rows + " x " + columns);

        //Move through the matrix printing the columns
        for (int i = 0; i < columns; i++) {
            //System.out.print(sentence.charAt(i));
            int currentIndex = i;
            for (int j = 0; j < rows; j++) {
                if (currentIndex <= s.length() - 1) {
                    result.append(s.charAt(currentIndex));
                }
                currentIndex += columns;
            }
            if (i + 1 != columns) {
                result.append(" ");
            }
        }

        return result.toString();
    }

}


