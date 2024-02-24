package JAVA;

import java.util.Scanner;

/**
 * J03024_Souuthe
 */
public class J03024_Souuthe {
    public static boolean check(String s){
        if(s.charAt(0) == '0') return false;
        for(char v:s.toCharArray()){
            if(v<'0' || v>'9') return false;
        }
        return true;
    }
    public static boolean soUuThe(String s){
        int le = 0, chan = 0;
        for(char v:s.toCharArray()){
            int num = Integer.parseInt(String.valueOf(v));
            if(num%2==0) chan++;
            else le++;
        }
        int so_cs = s.length();
        if(so_cs % 2 == 0 && chan > le) return true;
        if(so_cs % 2 == 1 && le > chan) return true;
        return false; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            if(check(s)){
                if(soUuThe(s)) System.out.println("YES");
                else System.out.println("NO");
            }
            else System.out.println("INVALID");

        }
    }
}