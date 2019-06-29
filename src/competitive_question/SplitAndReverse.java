package competitive_question;

import java.util.Arrays;

public class SplitAndReverse {

    public static void main(String[] args) {
        String s = "Pratyush Singh";
        String newString = "";
        String[] split_s = s.split(" ");

        for (int i = 0; i < split_s.length; i++) {
            newString = newString+split_s[split_s.length-i-1].toString() + " ";
        }
        System.out.println(newString);

    }
}
