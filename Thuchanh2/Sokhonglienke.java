package Thuchanh2;

import java.util.Scanner;

public class Sokhonglienke {
    
    public static boolean check1(String n){
        int tong = 0;
        for(char c:n.toCharArray())
            tong += Integer.parseInt(String.valueOf(c));
        if (tong%10==0) return true;
        return false;
    }
    public static boolean check2(String n){
        for(int i=1;i<n.length();i++){
            int num1 = Integer.parseInt(String.valueOf(n.charAt(i-1)));
            int num2 = Integer.parseInt(String.valueOf(n.charAt(i)));
            if(Math.abs(num1 - num2) != 2) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String n = sc.next();
            if (check1(n) && check2(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
