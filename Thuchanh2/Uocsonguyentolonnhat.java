package Thuchanh2;

import java.util.Scanner;

public class Uocsonguyentolonnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long us = -1;
            while(n%2==0) n/=2;
            for (int i=3;i<=Math.sqrt(n); i+=2){
                while(n%i==0){
                    n/=i;
                    us = i;
                }
            }
            if(n>2) us = n;
            System.out.println(us);
        }
    }
}
