package JAVA;

import java.util.Scanner;

public class J01014_UocSNTLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            long n = sc.nextLong();
            long uoc = -1;
            while(n%2 ==0){
                uoc = 2;
                n /= 2;
            }
            for(int i=3; i<=Math.sqrt(n); i+=2){
                while(n%i==0){
                    uoc = i;
                    n/=i;
                }
            }
            if(n>2) uoc = n;
            System.out.println(uoc);
        }
    }

}
