package nhap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Sinhvien{
    private String maString, tenString, lopString, emailString;

    public Sinhvien(String maString, String tenString, String lopString, String emailString) {
        this.maString = maString;
        this.tenString = tenString;
        this.lopString = lopString;
        this.emailString = emailString;
    }

    public String getMaString() {
        return maString;
    }

    public String getTenString() {
        return tenString;
    }

    public String getLopString() {
        return lopString;
    }

    public String getEmailString() {
        return emailString;
    }
    
    @Override
    public String toString(){
        return maString + " " + tenString + " " + lopString + " " + emailString;
    }
}

public class Nhap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Sinhvien> list = new ArrayList<>();
        while (t-->0){
            Sinhvien a = new Sinhvien(sc.nextLine(), sc.nextLine(),
            sc.nextLine(), sc.nextLine());
            list.add(a);
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-->0){
            String lop = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + lop + ":");
            for (Sinhvien v : list){
                if(v.getLopString().equalsIgnoreCase(lop)) System.out.println(v);
            }
        }
    }
}

/*

4
B16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
D15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
1
D15CQKT02-B


*/