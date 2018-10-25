package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class BirthdayBarChocolate {

    public static void main(String[] args){

        Scanner ui = new Scanner(System.in);
        boolean engage = true;
        int numberOfBars = ui.nextInt();

        if (numberOfBars < 1 || numberOfBars > 100){
            engage = false;
            System.out.println("Input error");
            ui.close();
        }

        int[] barValue = new int[numberOfBars];

        for (int i = 0; i < numberOfBars; i++){
            barValue[i] = ui.nextInt();
            if (barValue[i] < 1 || barValue[i] > 5){
                engage = false;
                System.out.println("Input error");
                ui.close();
            }
        }

        int parts = 2;
        int[] sharingDayMonth = new int[parts];

        for (int j = 0; j < parts; j++){
            sharingDayMonth[j] = ui.nextInt();
        }

        if (sharingDayMonth[0] < 1 || sharingDayMonth[0] > 31 || sharingDayMonth[1] < 1 || sharingDayMonth[1] > 12){
            engage = false;
            System.out.println("Input error");
            ui.close();
        }
        // calculation part
        while (engage) {
            int blocks = 0;
            for (int y = 0; y < (numberOfBars - sharingDayMonth[1] + 1); y++){
                int app = 0;
                for (int x = 0; x < sharingDayMonth[1]; x++){
                    app = app + barValue[y + x];
                }
                if (app == sharingDayMonth[0]){
                    blocks = blocks + 1;
                }
            }
            System.out.println(blocks);
            engage = false;
        }
        ui.close();
    }

}