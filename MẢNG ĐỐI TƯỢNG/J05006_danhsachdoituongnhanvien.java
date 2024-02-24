/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhap;

import java.util.Scanner;


class Nhanvien {
    private String ma, tenString, gtString, nsString, dcString, mstString, nkhdString;
    static int dem = 1;
    public Nhanvien(String tenString, String gtString, String nsString, String dcString, String mstString, String nkhdString) {
        this.tenString = tenString;
        this.gtString = gtString;
        this.nsString = nsString;
        this.dcString = dcString;
        this.mstString = mstString;
        this.nkhdString = nkhdString;
        this.ma = String.format("%05d", dem);
        dem += 1;
    }
    
    @Override
    public String toString(){
        return ma + " " + tenString + " " + gtString + " " + nsString + " " 
                + dcString + " " + mstString + " " + nkhdString;
    }
    
    
}



public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            Nhanvien a = new Nhanvien(sc.nextLine(), sc.nextLine(), sc.nextLine(), 
            sc.nextLine(), sc.nextLine(), sc.nextLine());
            System.out.println(a);
        }
    }
}

/*

3
Nguyen Van A
Nam
22/10/1982
Mo Lao-Ha Dong-Ha Noi
8333012345
31/12/2013
Ly Thi B
Nu
15/10/1988
Mo Lao-Ha Dong-Ha Noi
8333012346
22/08/2011
Hoang Thi C
Nu
04/02/1981
Mo Lao-Ha Dong-Ha Noi
8333012347
22/08/2011


*/


