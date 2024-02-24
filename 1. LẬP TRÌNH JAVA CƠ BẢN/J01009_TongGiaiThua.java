package JAVA;

import java.util.Scanner;

public class J01009_TongGiaiThua {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long tong = 0;
        for(int i=1;i<=n;i++){
            tong += giaiThua(i);
        }
        System.out.println(tong);
    }

    public static long giaiThua(int n){
        if(n == 1) return 1;
        return n * giaiThua(n-1);
    }
}
