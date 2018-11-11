package hackerrankchallenges.ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class DesignerPDFViewer {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);
        int result2 = designerPdfViewer2(h, word);

        System.out.println(String.valueOf(result));
        System.out.println(String.valueOf(result2));

        scanner.close();
    }


    // Complete the designerPdfViewer function below.
    private static int designerPdfViewer(int[] h, String word) {
        int[] arrOfWord = new int[word.length()];

        String[] wordByLetters = word.split("");
        for (int i = 0; i < wordByLetters.length; i++){
            String abc = wordByLetters[i];
            switch (abc){
                case "a":
                    arrOfWord[i] = h[0];
                    break;
                case "b":
                    arrOfWord[i] = h[1];
                    break;
                case "c":
                    arrOfWord[i] = h[2];
                    break;
                case "d":
                    arrOfWord[i] = h[3];
                    break;
                case "e":
                    arrOfWord[i] = h[4];
                    break;
                case "f":
                    arrOfWord[i] = h[5];
                    break;
                case "g":
                    arrOfWord[i] = h[6];
                    break;
                case "h":
                    arrOfWord[i] = h[7];
                    break;
                case "i":
                    arrOfWord[i] = h[8];
                    break;
                case "j":
                    arrOfWord[i] = h[9];
                    break;
                case "k":
                    arrOfWord[i] = h[10];
                    break;
                case "l":
                    arrOfWord[i] = h[11];
                    break;
                case "m":
                    arrOfWord[i] = h[12];
                    break;
                case "n":
                    arrOfWord[i] = h[13];
                    break;
                case "o":
                    arrOfWord[i] = h[14];
                    break;
                case "p":
                    arrOfWord[i] = h[15];
                    break;
                case "q":
                    arrOfWord[i] = h[16];
                    break;
                case "r":
                    arrOfWord[i] = h[17];
                    break;
                case "s":
                    arrOfWord[i] = h[18];
                    break;
                case "t":
                    arrOfWord[i] = h[19];
                    break;
                case "u":
                    arrOfWord[i] = h[20];
                    break;
                case "v":
                    arrOfWord[i] = h[21];
                    break;
                case "w":
                    arrOfWord[i] = h[22];
                    break;
                case "x":
                    arrOfWord[i] = h[23];
                    break;
                case "y":
                    arrOfWord[i] = h[24];
                    break;
                case "z":
                    arrOfWord[i] = h[25];
                    break;
            }
        }
        Arrays.sort(arrOfWord);


        return arrOfWord[arrOfWord.length-1] * arrOfWord.length;
    }

    private static int designerPdfViewer2(int[] h, String word){
        int maxHeight = 0;//Initialized to 0 because it is below the minimum range for height

        for(int i = 0; i < word.length(); i++) {
            if(maxHeight < h[word.charAt(i)-97]) //  determines if the height of the current letter is greater than max so far
            {                                    //97 is subtracted because we are using the int value of our letter for indexing
                maxHeight = h[word.charAt(i)-97];
            }
        }
        return word.length() * maxHeight;
    }
}
