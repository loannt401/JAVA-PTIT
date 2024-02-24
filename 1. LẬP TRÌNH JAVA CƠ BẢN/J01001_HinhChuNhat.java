package JAVA;

import java.util.Scanner;

public class J01001_HinhChuNhat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chieuDai = scan.nextInt();
        int chieuRong = scan.nextInt();
        if(chieuDai <= 0 || chieuRong <= 0){
            System.out.println(0);
        }
        else {
            int chuVi = 2 * (chieuDai + chieuRong);
            int dienTich = chieuDai * chieuRong;
            System.out.println(chuVi + " " + dienTich);
        }
    }
}
