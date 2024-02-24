package JAVA.timHieuSau;

import java.util.Scanner;

/**
 * phanso
 */
class phanSo{

    long tuSo;
    long mauSo;
    static Scanner sc = new Scanner(System.in);

    void nhapPS(){
        tuSo = sc.nextLong();
        mauSo = sc.nextLong();
    }

    void hienThiPS(){
        System.out.println(tuSo + "/" + mauSo);
    }
    
    void toGianPS(){
        long a=tuSo;
        long b=mauSo;
        while(a!=0){
            long x=a;
            a=b%a;
            b=x;
        }
        tuSo/=b;mauSo/=b;
    }
}

/**
 * phanso
 */
public class phanso {

    public static void main(String[] args) {
        phanSo a = new phanSo();
        phanSo b = new phanSo();
        a.nhapPS(); b.nhapPS();
        a.toGianPS(); b.toGianPS();
        phanSo c = new phanSo();
        c.tuSo = a.tuSo * b.mauSo + b.tuSo * a.mauSo;
        c.mauSo = a.mauSo * b.mauSo;
        c.toGianPS();
        c.hienThiPS();
    }
}
