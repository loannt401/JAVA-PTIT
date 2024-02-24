package JAVA;

import java.util.Scanner;

public class J03026_Xaukhacnhaudainhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s1 = sc.next();
            String s2 = sc.next();
            if(s1.equals(s2)) System.out.println(-1);
            else {
                int len1 = s1.length();
                int len2 = s2.length();
                int val = (len1>=len2)?len1:len2;
                System.out.println(val);
            }
        }
    }
}
