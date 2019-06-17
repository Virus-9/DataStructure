package datastructure.arrays;

import java.util.Arrays;

public class Array {
    public void arr(){
    int raman[] = {1,2,3,4,5};
    char c[] = {'a','b','c','d'}; //or
        char d[];
        d = new char[4];
//        d[0]='b';
        d[3]='e';
        d[1]='s';
      String[] abc =   {"Einstein", "Newton", "Copernicus", "Kepler"};
        System.out.println(d);
        System.out.println(c);
        System.out.println(raman);
        System.out.println(abc);
        System.out.println(Arrays.toString(raman));
        System.out.println(c.length);
        String a = "Pratyush singh kushwah";
        System.out.println(a.length());

}

    public static void main(String[] args) {
       Array arra = new Array();
       arra.arr();
    }
}
