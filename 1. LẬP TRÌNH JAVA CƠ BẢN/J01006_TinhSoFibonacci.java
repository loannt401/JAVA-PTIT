package JAVA;

import java.util.Scanner;

public class J01006_TinhSoFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while(t>0){
            t-=1;
            long n = scan.nextLong();
            System.out.println(Fibonacci(n));
        }

    }
    public static long Fibonacci(long n){
        long f0 = 0, f1 = 1, fn = 1;
        if(n<0) return -1;
        else if(n == 0 || n == 1) return n;
        else {
            for(long i=2; i<n; i++){
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
}
