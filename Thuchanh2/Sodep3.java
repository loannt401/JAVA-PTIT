package Thuchanh2;

import java.util.Scanner;

public class Sodep3 {
    public static boolean check1(String s){
        String dao = new StringBuffer(s).reverse().toString();
        if(s.equals(dao)) return true;
        return false;
    }
    public static boolean check2(String s){
        for (char c:s.toCharArray()){
            if(c != '2' && c!='3' && c!='5' && c != '7') return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            if(check1(s) && check2(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
