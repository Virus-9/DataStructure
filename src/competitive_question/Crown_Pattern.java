package competitive_question;

import java.util.Scanner;

public class Crown_Pattern {

    public static void main(String[] args){
        System.out.println("Enter number of lines");
        int line = new Scanner(System.in).nextInt();
        int space = (line*2)-2;
        for(int i =1;i<=line;i++){
            //Left Part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //Space Part
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }

            //Right Part
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            space = space -2;
            System.out.println();
        }
    }
}
