package competitive_question;

import java.util.Scanner;

public class Star_Pyramid {
    public static void main(String[] args) {
        System.out.println("Enter the Pyramid Height");
        int line = new Scanner(System.in).nextInt();
        for(int i=1;i<=line;i++){
            for(int j=1;j<=line-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
