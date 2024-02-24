package JAVA;

import java.util.Scanner;

/**
 * J01007_KiemTraSoFibonacci
 */
public class J01007_KiemTraSoFibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t>0){
            t-=1;
            long n = scan.nextLong();
            if(checkSoFibonacci(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean checkSoFibonacci(long n){
        if (n == 1 || n == 0) return true;
        long f0 = 0, f1 = 1;
        for(int i=3;i<=93; i++){
            long fn = f0 + f1;
            if(fn == n) return true;
            f0 = f1;
            f1 = fn;
        }
        return false;
    }
}