package datastructure.arrays;

public class Prime_Sieve {
    public static void printPrimes(int n){
        boolean[] prime = new boolean[n+1];//n+1 because we want index from 0-n and not fill 0
        int i;
        for(i =2;i<=n;i++){
        prime[i]=true;// here we can see we are using array from 2nd index
        }
        for(int divisor =2; divisor *divisor<=n;divisor++){
            if(prime[divisor]){
                for(i=2*divisor;i<=n;i=i+divisor){
                    prime[i]=false;
                }
            }
        }
        for(i=2;i<=n;i++){
            if(prime[i]){
                System.out.println(" "+ i);
            }
        }
    }

    public static void main(String[] args) {
        printPrimes(10);
    }
}
