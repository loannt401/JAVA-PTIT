/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class Nhanvien implements Comparable<Nhanvien>{
    private String ma, tenString, gtString, nsString, dcString, mstString, nkhdString;
    static int dem = 1;
    private int ngay, thang, nam;
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

    public int getNgay() {
        String s = nsString.substring(0,2);
        ngay = Integer.parseInt(s);
        return ngay;
    }

    public int getThang() {
        String s = nsString.substring(3,5);
        thang = Integer.parseInt(s);
        return thang;
    }

    public int getNam() {
        String s = nsString.substring(6);
        nam = Integer.parseInt(s);
        return nam;
    }
    
    
    
    @Override
    public String toString(){
        return ma + " " + tenString + " " + gtString + " " + nsString + " " 
                + dcString + " " + mstString + " " + nkhdString;
    }

    @Override
    public int compareTo(Nhanvien o) {
        if (this.getNam() > o.getNam()) return 1;
        else if (this.getNam() == o.getNam() && this.getThang() > o.getThang()) return 1;
        else if (this.getNam() == o.getNam() && this.getThang() == o.getThang()
                && this.getNgay() > o.getNgay()) return 1;
        else return -1;
    }
    
    
}



public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Nhanvien> list = new ArrayList<>();
        while(t-->0){
            Nhanvien a = new Nhanvien(sc.nextLine(), sc.nextLine(), sc.nextLine(), 
            sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(a);
        }
        Collections.sort(list);
        for (Nhanvien v : list){
            System.out.println(v);
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


