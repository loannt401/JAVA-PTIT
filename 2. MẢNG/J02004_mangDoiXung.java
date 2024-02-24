package JAVA;

import java.util.Scanner;

public class J02004_mangDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            int l=0, r=n-1;
            boolean ok = true;
            while(l<r){
                if(a[l] != a[r]) {
                    ok = false;
                    break;
                }
                l++; r--;
            }
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
