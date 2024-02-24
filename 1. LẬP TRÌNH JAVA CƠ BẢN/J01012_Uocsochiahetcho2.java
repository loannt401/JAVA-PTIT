package JAVA;

import java.util.Scanner;

public class J01012_Uocsochiahetcho2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            long n = sc.nextLong();
            if(n%2!=0) System.out.println(0);
            else{
                int k=1;
                long m = n/2;
                while(m%2==0){
                    k++;
                    m = m/2;
                }
                if(m == 1) System.out.println(k);
                else{
                    int dem=2;
                    for(int i=3;i<=Math.sqrt(m);i++){
                        if(m%i==0) {
                            if(m/i==i) dem++;
                            else dem +=2;
                        }
                    }
                    System.out.println(dem*k);
                }
            }
        }
    }
}
