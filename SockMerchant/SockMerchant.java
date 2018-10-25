package hackerrankchallenges.ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int n = ui.nextInt();
        int[] socks = new int[n];
        for(int i = 0; i < n; i++){
            socks[i] = ui.nextInt();
        }
        Arrays.sort(socks);
        System.out.println(numberOfPairs(n, socks));
    }

    private static int numberOfPairs(int n, int[] ar){
        int pairs = 0;
        for (int i = 0; i < n-1; i++){
            if(i < n && ar[i] == ar[i + 1] ){
                pairs++;
                i = i + 1;
            }
        }
        return pairs;
    }
}
