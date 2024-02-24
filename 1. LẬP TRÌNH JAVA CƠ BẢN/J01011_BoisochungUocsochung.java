package JAVA;

import java.util.Scanner;

public class J01011_BoisochungUocsochung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = a, d = b;
            while(a != b){
                if(a>b) a = a-b;
                else b = b-a;
            }
            System.out.println((c*d)/a + " " + a);
        }
    }
}
