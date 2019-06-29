package competitive_question;

import java.util.Scanner;

public class Inverted_Pyramid {
    public static void main(String[] args) {
        System.out.println("Enter the Pyramid Height");
        int line = new Scanner(System.in).nextInt();
        for(int i=1;i<=line;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=((line*2)-(2*i-1));k++){
                System.out.print("*");
            }
            System.out.println();
        }
    } // star 9 7 5 3 1
      // i = 1 2 3 4 5 line =5
}
