package competitive_question;

import java.util.Scanner;

public class Prime_Number {

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        if (number == 2) {
            System.out.println("True");
        }
        else if(number>2)
            System.out.println(primeNumber(number));
        else
            System.out.println("Prime number starts from 2");
    }


    public static boolean primeNumber(int number) {

        for (int i = 2; i < (number/2); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
