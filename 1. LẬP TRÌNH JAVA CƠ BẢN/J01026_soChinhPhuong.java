package JAVA;

import java.util.Scanner;

public class J01026_soChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            int n = sc.nextInt();
            int x = (int) Math.sqrt(n);
            if(x == Math.sqrt(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
