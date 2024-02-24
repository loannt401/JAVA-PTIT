package JAVA;

import java.util.Scanner;

public class J03025_Xaudoixung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int l=0, r=s.length()-1;
            int dem = 0;
            while(l<r){
                String s1 = String.valueOf(s.charAt(l));
                String s2 = String.valueOf(s.charAt(r));
                if(!s1.equals(s2)) dem++;
                l++; r--;
            }
            if(dem == 1) System.out.println("YES");
            else if(dem == 0 && s.length()%2==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
