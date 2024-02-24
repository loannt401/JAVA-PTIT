package JAVA;

import java.util.Scanner;

public class J01004_SoNguyenTo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while(t>0){
            long n = scan.nextLong();
            if(SoNguyenTo(n)) System.out.println("YES");
            else System.out.println("NO");
            t-=1;
        }
    }

    public static boolean SoNguyenTo(long x){
        if(x < 2) return false;
        for(int i=2;i<=(int)Math.sqrt(x);i++)
            if(x%i==0) return false;
        return true;
    }
}
