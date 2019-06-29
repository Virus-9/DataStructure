package competitive_question;

import java.util.Scanner;

public class Pallandrome_String {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        System.out.println(s);
        char[] revString = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            revString[i] = s.charAt(s.length() - i - 1);
        }

        System.out.println(new String(revString));
        if (s.equals(new String(revString))) {
            System.out.println("String is pallandrome");
       }
        else
            System.out.println("String is not pallandrome");
    }
}
