package competitive_question;

//Write a simple Java program which will print Fibonacci series e.g. 1 1 2 3 5 8 13

import java.util.Arrays;
import java.util.Scanner;

public class Fabonacci_Series {

    public static void main(String[] args) {

        System.out.println("How many number you want the fabonacci series to Be:");
        int count = new Scanner(System.in).nextInt();
        Fabonacci_Series fabSeries = new Fabonacci_Series();
        System.out.println(Arrays.toString(fabSeries.fabonacci(count)));

    }

    public int[] fabonacci(int count) {
        int[] series = new int[count];


        if (count == 1)
            series[0] = 1;
        else if (count == 2) {
            series[0] = 1;
            series[1] = 1;
        } else {
            series[0] = 1;
            series[1] = 1;
            for (int i = 1; i < count - 1; i++) {
                series[i + 1] = series[i - 1] + series[i];
            }
        }
        return series;
    }

//    public int[] fabonacciRecursion(int count) {
//       if(count ==1 || count==2)
//        int[] series = new int[n];
//        series[0] = a;
//        series[1] = 1;
//        for (int i = 1; i < n - 1; i++) {
//            series[i + 1] = series[i - 1] + series[i];
//        }
//        return series;
//    }


}

