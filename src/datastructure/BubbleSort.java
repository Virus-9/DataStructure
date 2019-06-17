package src.datastructure;

import java.util.Arrays;

public class BubbleSort {
    public static void sort() {
        int[] input = {3, 5, 6, 2, 10};
        for (int i = 0;i<input.length;i++){
            for(int j=0;j<input.length-1;j++){
                if(input[j]>input[j+1]){
                    int temp = input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(input));
    }

    public static void main(String[] args) {
        sort();
    }
}
