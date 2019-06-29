package competitive_question;

public class Diamond_Shape {
    public static void main(String[] args) {
        int number, i, k, count = 1;
        number = 5;
        count = number - 1;
        for (k = 1; k <= number; k++) {
            for (i = 1; i <= count; i++)
                System.out.print(" ");
            count--;
            for (i = 1; i <= 2 * k - 1; i++)
                System.out.print("*");
            System.out.println();
        }
        for(i=2;i<=number;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for( k=1;k<=((number*2)-(2*i-1));k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
