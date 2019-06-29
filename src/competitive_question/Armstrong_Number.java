package competitive_question;

import java.util.Scanner;

public class Armstrong_Number {

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int a = 0,numbernew = number;
        int sizeOfNumber = String.valueOf(number).length();
        //while (numbernew>0)
        for (int i = 0; i < sizeOfNumber; i++) {
            int c = numbernew % 10;
            numbernew = numbernew/10;
            a = a + (int)(Math.pow(c, sizeOfNumber));
        }
        if(a == number){
            System.out.println("Number is Armstrong" +" " + number);
        }
        else
            System.out.println("Number is not Armstrong");
    }
}
