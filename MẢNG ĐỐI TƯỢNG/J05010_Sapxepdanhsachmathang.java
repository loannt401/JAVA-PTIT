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


class Mathang implements Comparable<Mathang>{
    private int ma;
    private String tenString, nhomString;
    private double mua, ban, tong;

    public Mathang(int ma, String tenString, String nhomString, double mua, double ban) {
        this.ma = ma;
        this.tenString = tenString;
        this.nhomString = nhomString;
        this.mua = mua;
        this.ban = ban;
        this.tong = ban - mua;
    }
    
    @Override
    public String toString(){
        return ma + " " + tenString + " " + nhomString + " " + String.format("%.2f", tong);
    }

    @Override
    public int compareTo(Mathang o) {
        if (this.tong < o.tong) return 1;
        else return -1;
    }
    
    
}


public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Mathang> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t; i++){
            Mathang a = new Mathang(i,sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),
            Double.parseDouble(sc.nextLine()));
            list.add(a);
        }
        Collections.sort(list);
        for(Mathang x : list){
            System.out.println(x);
        }
    }
}

/*

3
May tinh SONY VAIO
Dien tu
16400
17699
Tu lanh Side by Side
Dien lanh
18300
25999
Banh Chocopie
Tieu dung
27.5
37


*/


