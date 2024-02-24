package nhap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Hocsinh implements Comparable<Hocsinh>{
    private String ma, tenString, loai;
    private double diemtb;

    public Hocsinh(int ma, String tenString, double [] a) {
        this.ma = "HS" + String.format("%02d", ma);
        this.tenString = tenString;
        this.diemtb = TinhDiemtb(a);
        this.loai = getLoai();
    }

    public String getLoai() {
        double x = diemtb;
        if (x<5) return "YEU";
        else if (x<7) return "TB";
        else if (x<8) return "KHA";
        else if (x<9) return "GIOI";
        else return "XUAT SAC";
    }

    public double TinhDiemtb(double [] a) {
        double tong = a[0] * 2 + a[1] * 2;
        for (int i=2; i<10;i++) tong += a[i];
        tong /= 12;
        tong = Math.round(tong * 10.0)/10.0;
        return tong;
    }
    
    public double getDiemtb(){
        return diemtb;
    }
    
    @Override
    public String toString(){
        return ma + " " + tenString + " " + String.format("%.1f", diemtb) + " " + loai;
    }

    @Override
    public int compareTo(Hocsinh o) {
        if (this.getDiemtb() <= o.getDiemtb()) return 1;
        return -1;
    }
    
}

public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Hocsinh> list = new ArrayList<>();
        for(int it=1; it<=t;it++){
            sc.nextLine();
            String ten = sc.nextLine();
            double[] a = new double[10];
            for(int i=0;i<10;i++) a[i] = sc.nextDouble();
            Hocsinh b = new Hocsinh(it, ten, a);
            list.add(b);
        }
        Collections.sort(list);
        for (Hocsinh x : list){
            System.out.println(x);
        }
    }
}

/*

4
Luu Thuy Nhi
9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
Le Van Tam
8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
Nguyen Thai Binh
9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
Luu Thuy Nhi
9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5

*/