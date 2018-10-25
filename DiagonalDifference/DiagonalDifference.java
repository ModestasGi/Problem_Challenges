package hackerrankchallenges.ProblemSolving;

        import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {

        Scanner ui = new Scanner(System.in);
        int matrixSize = Integer.parseInt(ui.nextLine());
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        // calculating crosswise
        for(int i = 0, j = matrixSize - 1; i < matrixSize; i++, j--){
            String[] matrixLine = ui.nextLine().split(" ");
            firstDiagonal = firstDiagonal + Integer.parseInt(matrixLine[i]);
            secondDiagonal = secondDiagonal + Integer.parseInt(matrixLine[j]);
        }
        System.out.println(Math.abs(firstDiagonal - secondDiagonal));
    }
}
