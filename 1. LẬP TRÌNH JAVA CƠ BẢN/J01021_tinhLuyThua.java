package JAVA;

import java.util.Scanner;

/**
 * J01021_tinhLuyThua
 */
public class J01021_tinhLuyThua {
    public static long M = 1000000007;
    public static long power(long n, long k){
        n %= M;
        long c = 1;
        long temp = n;
        while(k>=1){
            if(k%2==1){
                c *= temp;
                c %= M;
            }
            k /= 2;
            temp = temp * temp % M;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong() % M;
            long b = sc.nextLong();
            if(a==0 && b==0) break;
            System.out.println(power(a, b));
        }
    }
}
