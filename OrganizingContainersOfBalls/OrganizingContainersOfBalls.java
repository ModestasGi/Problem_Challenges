package hackerrankchallenges.ProblemSolving;

import java.util.LinkedList;
import java.util.Scanner;

public class OrganizingContainersOfBalls {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[][] container = new int[n][n];

            for (int i = 0; i < n; i++) {
                String[] containerRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < n; j++) {
                    int containerItem = Integer.parseInt(containerRowItems[j]);
                    container[i][j] = containerItem;
                }
            }

            String result = organizingContainers(container, n);

            System.out.println(result);
        }

        scanner.close();
    }

    // Complete the organizingContainers function below.
    private static String organizingContainers(int[][] container, int n) {

        //Create a bag for the amount of  each ball and the sizes of containers
        LinkedList<Integer> containers = new LinkedList<>();
        LinkedList<Integer> balls = new LinkedList<>();
        for(int i = 0; i < n; i++){
            int rowSum = 0;
            int colSum = 0;
            for(int j = 0; j < n; j++){
                rowSum += container[i][j];
                colSum += container[j][i];
            }
            balls.add(colSum);
            containers.add(rowSum);
        }

        //Check if the two bags are equal
        containers.removeAll(balls);
        if(containers.isEmpty()){
            return "Possible";
        }

        else return "Impossible";

    }

}
