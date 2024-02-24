package JAVA;

import java.util.Scanner;

public class J01005_ChiaTamGiac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t>0){
            int n = scan.nextInt();
            int h = scan.nextInt();
            for(int i=1;i<n;i++){
                double doDai = h*Math.sqrt((double)i/n);
                System.out.printf("%.6f ", doDai);
                
            }
            System.out.println("");
            t-=1;
        }
    }
}


/*
    cho mot tam giac can do dai day bang 1 va chieu cao bang h.
    chia tam giac thanh n phan co dien tich bang nhau va song song voi day

    Input :
        so bo test
        n va h
    Output :
        in ra n - 1 so la khoang cach tu cat thu i toi dinh tam giac

    Cach lam :
        h * can(i/n) la dien tich phan thu i
 */