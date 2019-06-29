package competitive_question;

import java.util.Scanner;

public class Star_Number {
    public static void main(String[] args) {
        System.out.println("Enter the Pyramid Height");
        int line = new Scanner(System.in).nextInt();
        for (int i = 1; i <= line; i++) {
            int l =1;
            for (int j = 1; j <= i; j++) {
                System.out.print(l++);
            }
            for (int k = 1; k <= line -i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
