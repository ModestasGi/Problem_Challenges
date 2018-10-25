package hackerrankchallenges.ProblemSolving;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BonApetitAsDescribed {

    public static void main(String[] args) throws IOException {
        Scanner ui = new Scanner(System.in);
        String[] nk = ui.nextLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nk[0]); // number of ordered items

        int k = Integer.parseInt(nk[1]); // item not eated

        List<Integer> bill = Stream.of(ui.nextLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int b = Integer.parseInt(ui.nextLine().trim()); // the amount of money contributed to the bill

        bonAppetit(bill, k, b);

        ui.close();
    }

    static void bonAppetit(List<Integer> bill, int k, int b){
        int totalSum = 0;
        for(int i = 0; i < bill.size(); i++){
            totalSum += bill.get(i);
        }
        if(k == 0){
            if(totalSum == b){
                System.out.println("Bon Appetit");
            } else {
                System.out.println(b - totalSum);
            }
        } else {
            if(b == (totalSum - bill.get(k)) /2 ){
                System.out.println("Bon Appetit");
            }else{
                System.out.println("" + (b - (totalSum - bill.get(k))/2));
            }
        }
    }
}
