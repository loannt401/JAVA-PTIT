package nhap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Chude {
    private int ma;
    private String tenString;

    public Chude(int ma, String tenString) {
        this.ma = ma;
        this.tenString = tenString;
    }
    
    @Override
    public String toString(){
        return "Bai tap dang ky: " + tenString;
    }
}

class Sinhvien implements Comparable<Sinhvien>{
    private String maString,tenString, sdtString;
    private int chude;

    public Sinhvien(String maString, String tenString, String sdtString, int chude) {
        this.maString = maString;
        this.tenString = tenString;
        this.sdtString = sdtString;
        this.chude = chude;
    }

    public int getChude() {
        return chude;
    }

    public String getMaString() {
        return maString;
    }
    
    
    
    @Override
    public String toString(){
        return maString + " " + tenString + " " + sdtString;
    }

    @Override
    public int compareTo(Sinhvien o) {
        return this.getMaString().compareTo(o.getMaString());
    }
}

public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] s = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        List<Sinhvien> list1 = new ArrayList<>();
        List<Chude> list2 = new ArrayList<>();
        for(int i=0; i<n; i++){
            Sinhvien a = new Sinhvien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            list1.add(a);
        }
        for (int i=0; i<k; i++){
            Chude b = new Chude(i, sc.nextLine());
            list2.add(b);
        }
        int q = Integer.parseInt(sc.nextLine());
        for(int i=0; i<q; i++){
            int x = Integer.parseInt(sc.nextLine());
            for (Sinhvien v : list1){
                if(v.getChude() == x) System.out.println(v);
            }
            System.out.println(list2.get(x-1));
        }
        
    }
}

/*

5 2
B17DTCN001
Nguyen Chi  Linh
0987345543
1
B17DTCN011
Vu Viet Thang
0981234567
1
B17DTCN023
Pham Trong Thang
0992123456
1
B17DTCN022
Nguyen Van  Quyet
0977865432
2
B17DTCN031
Ngo Thanh Vien
0912313111
2
Xay dung website ban dien thoai truc tuyen
Xay dung ung dung quan ly benh nhan Covid-19
1
1

*/