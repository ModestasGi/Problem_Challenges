package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class QueensAttackII {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        int k = scanner.nextInt();

        int r_q = scanner.nextInt();

        int c_q = scanner.nextInt();

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {

            obstacles[i][0] = scanner.nextInt();
            obstacles[i][1] = scanner.nextInt();

        }
        scanner.close();
        int result1 = queensAttack1(n, k, r_q, c_q, obstacles);
        System.out.println("\n first method " + result1);
        int result2 = queensAttack2(n, k, r_q, c_q, obstacles);
        System.out.println("\n second method " + result2);

    }

    private static int queensAttack2(int n, int k, int x_q, int y_q, int[][] obstacles) {
        int count = 0;

        // counting move NN
        for (int a = 1; a < n; a++) {
            int xMove = x_q;
            if (xMove == n) {
                break;
            } else {
                xMove += a;
                if (ifObstacle(xMove, y_q, k, obstacles)) {
                    break;
                }
                count++;
            }
            if (xMove == n) {
                break;
            }
        }
        //System.out.println("finished counting moves NN " + count);
        // counting move NE
        for (int a = 1; a < n; a++) {
            int xMove = x_q;
            int yMove = y_q;
            if (xMove == n || yMove == n) {
                break;
            } else {
                xMove += a;
                yMove += a;
                if (ifObstacle(xMove, yMove, k, obstacles)) {
                    break;
                }
                count++;
            }
            if (xMove == n || yMove == n) {
                break;
            }
        }
        //System.out.println("\nfinished counting moves NE " + count);
        // counting move EE
        for (int a = 1; a < n; a++) {
            int yMove = y_q;
            if (yMove == n) {
                break;
            } else {
                yMove += a;
                if (ifObstacle(x_q, yMove, k, obstacles)) {
                    break;
                }
                count++;
            }
            if (yMove == n) {
                break;
            }
        }
        //System.out.println("\nfinished counting moves EE " + count);
        // counting move ES
        for (int a = 1; a < n; a++) {
            int xMove = x_q;
            int yMove = y_q;
            if (yMove == n || xMove == 1) {
                break;
            } else {
                xMove -= a;
                yMove += a;
                if (ifObstacle(xMove, yMove, k, obstacles)) {
                    break;
                }
                count++;
            }
            if (yMove == n || xMove == 1) {
                break;
            }
        }
        //System.out.println("\nfinished counting moves ES " + count);
        // counting move SS
        for (int a = 1; a < n; a++) {
            int xMove = x_q;
            if (xMove == 1) {
                break;
            } else {
                xMove -= a;
                if (ifObstacle(xMove, y_q, k, obstacles)) {
                    break;
                }
                count++;
            }
            if (xMove == 1) {
                break;
            }
        }
        ///System.out.println("\nfinished counting moves SS " + count);
        // counting move SW
        for (int a = 1; a < n; a++) {
            int xMove = x_q;
            int yMove = y_q;
            if (yMove == 1 || xMove == 1) {
                break;
            } else {
                xMove -= a;
                yMove -= a;
                if (ifObstacle(xMove, yMove, k, obstacles)) {
                    break;
                }
                count++;
            }
            if (yMove == 1 || xMove == 1) {
                break;
            }
        }
        //System.out.println("\nfinished counting moves SW " + count);
        // counting move WW
        for (int a = 1; a < n; a++) {
            int yMove = y_q;
            if (yMove == 1) {
                break;
            } else {
                yMove -= a;
                if (ifObstacle(x_q, yMove, k, obstacles)) {
                    break;
                }
                count++;
            }
            if (yMove == 1) {
                break;
            }
        }
        //System.out.println("\nfinished counting moves WW " + count);
        // counting move WN
        for (int a = 1; a < n; a++) {
            int xMove = x_q;
            int yMove = y_q;
            if (xMove == n || yMove == 1) {
                break;
            } else {
                xMove += a;
                yMove -= a;
                if (ifObstacle(xMove, yMove, k, obstacles)) {
                    break;
                }
                count++;
            }
            if (xMove == n || yMove == 1) {
                break;
            }
        }
        //System.out.println("\nfinished counting moves WN " + count);

        return count;
    }

    private static boolean ifObstacle(int xMove, int yMove, int k, int[][] obstacles) {

        for (int i = 0; i < k; i++) {
            if (obstacles[i][0] == xMove && obstacles[i][1] == yMove) {
                // System.out.println("Sorry, impossible to move\nfound obstacle at: " + xMove + ", " + yMove);
                return true;
            }
        }
        return false;
    }

    private static int queensAttack1(int n, int k, int x_q, int y_q, int[][] obstacles) {
        //Row Column coordinates of the closes object in each direction
        int rRObstacle = -1;
        int cRObstacle = -1;
        int rBRObstacle = -1;
        int cBRObstacle = -1;
        int rBObstacle = -1;
        int cBObstacle = -1;
        int rBLObstacle = -1;
        int cBLObstacle = -1;
        int rLObstacle = -1;
        int cLObstacle = -1;
        int rTLObstacle = -1;
        int cTLObstacle = -1;
        int rTObstacle = -1;
        int cTObstacle = -1;
        int rTRObstacle = -1;
        int cTRObstacle = -1;

        //Total squares attacked by the queen
        int reachableSquares = 0;
        //Finds the closest object in each direction
        for (int a0 = 0; a0 < k; a0++) {
            int rObstacle = obstacles[a0][0];
            int cObstacle = obstacles[a0][1];

            //Right
            if ((cObstacle < cRObstacle || rRObstacle == -1) && cObstacle > y_q && rObstacle == x_q) {
                rRObstacle = rObstacle;
                cRObstacle = cObstacle;
            }

            //Bottom Right
            if (x_q - rObstacle == cObstacle - y_q && cObstacle > y_q && rObstacle < x_q
                    && ((rObstacle > rBRObstacle && cObstacle < cBRObstacle) || rBRObstacle == -1)) {
                rBRObstacle = rObstacle;
                cBRObstacle = cObstacle;
            }

            //Bottom
            if ((rObstacle > rBObstacle || rBObstacle == -1) && rObstacle < x_q && cObstacle == y_q) {
                rBObstacle = rObstacle;
                cBObstacle = cObstacle;
            }

            //Bottom Left
            if (x_q - rObstacle == y_q - cObstacle && cObstacle < y_q && rObstacle < x_q
                    && ((rObstacle > rBLObstacle && cObstacle > cBLObstacle) || rBLObstacle == -1)) {
                rBLObstacle = rObstacle;
                cBLObstacle = cObstacle;
            }

            //Left
            if ((cObstacle > cLObstacle || rLObstacle == -1) && cObstacle < y_q && rObstacle == x_q) {
                rLObstacle = rObstacle;
                cLObstacle = cObstacle;
            }

            //Top Left
            if (y_q - cObstacle == rObstacle - x_q && cObstacle < y_q && rObstacle > x_q
                    && ((rObstacle < rTLObstacle && cObstacle > cTLObstacle) || rTLObstacle == -1)) {
                rTLObstacle = rObstacle;
                cTLObstacle = cObstacle;
            }

            //Top
            if ((rObstacle < rTObstacle || rTObstacle == -1) && rObstacle > x_q && cObstacle == y_q) {
                rTObstacle = rObstacle;
                cTObstacle = cObstacle;
            }

            //Top Right
            if (rObstacle - x_q == cObstacle - y_q && cObstacle > y_q
                    && rObstacle > x_q && ((rObstacle < rTRObstacle && cObstacle < cTRObstacle) || rTRObstacle == -1)) {
                rTRObstacle = rObstacle;
                cTRObstacle = cObstacle;
            }

        }

        //Calculates the distance to the closest obstacle in each direction and adds it to reachableSquares
        //R B L T
        reachableSquares += (cRObstacle != -1) ? (cRObstacle - y_q - 1) : n - y_q;
        reachableSquares += (rBObstacle != -1) ? (x_q - rBObstacle - 1) : x_q - 1;
        reachableSquares += (cLObstacle != -1) ? (y_q - cLObstacle - 1) : y_q - 1;
        reachableSquares += (rTObstacle != -1) ? (rTObstacle - x_q - 1) : n - x_q;

        //BR BL TL TR
        reachableSquares += (cBRObstacle != -1) ? (cBRObstacle - y_q - 1) : Math.min(n - y_q, x_q - 1);
        reachableSquares += (rBLObstacle != -1) ? (y_q - cBLObstacle - 1) : Math.min(y_q - 1, x_q - 1);
        reachableSquares += (cTLObstacle != -1) ? (y_q - cTLObstacle - 1) : Math.min(y_q - 1, n - x_q);
        reachableSquares += (rTRObstacle != -1) ? (cTRObstacle - y_q - 1) : Math.min(n - y_q, n - x_q);

        return Math.abs(reachableSquares);

    }
}
