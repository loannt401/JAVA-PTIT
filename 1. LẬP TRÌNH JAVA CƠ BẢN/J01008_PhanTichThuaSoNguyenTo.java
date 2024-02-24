package JAVA;

import java.util.Scanner;

public class J01008_PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int k = 1;
        while(t>0){
            t-=1;
            long n = scan.nextLong();
            System.out.print("Test " + k +": ");
            k+=1;
            int dem;
            for(int i=2;i<=n;i++){
                dem = 0;
                while(n%i == 0){
                    dem+=1;
                    n/=i;
                }
                if(dem>0){
                    System.out.print(i + "(" + dem + ") ");
                }
            }
            System.out.println("");
        }
    }
}
