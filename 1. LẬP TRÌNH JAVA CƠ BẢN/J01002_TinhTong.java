package JAVA;

import java.util.Scanner;

public class J01002_TinhTong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while(t>0){
            long n = scan.nextLong();
            long tong = (n*(n+1))/2;
            System.out.println(tong);
            t-=1;
        }
    }
}
