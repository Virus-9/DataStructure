package datastructure;

import java.util.Scanner;

    /**
     * Java program to calculate and print Fibonacci number using both recursion
     * and Iteration.
     * Fibonacci number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2
     * first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
     *
     * @author Javin
     */
    public class Junk {
            static int fib(int n)
            {
                if (n <= 1)
                    return n;
                return fib(n-1) + fib(n-2);
            }

            public static void main (String args[])
            {
                int n = 3;

                System.out.println(fib(n));
            }
        }
