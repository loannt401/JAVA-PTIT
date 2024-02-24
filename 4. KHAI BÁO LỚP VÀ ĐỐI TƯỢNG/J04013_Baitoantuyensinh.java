

import java.util.Scanner;


class Thisinh {
    String maString, tenString;
    float toan, ly, hoa;
    public Thisinh(String maString, String tenString, float toan, float ly, float hoa){
        this.maString = maString;
        this.tenString = tenString;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public float diemuutien(){
        String s = this.maString.substring(0,3);
        if(s.equals("KV1")) return (float)0.5;
        if(s.equals("KV2")) return (float)1.0;
        return (float)2.5;
    }
    public float tongdiem(){
        return this.toan*2+this.ly+this.hoa;
    }
    public String trangthai(){
        float t = tongdiem() + diemuutien();
        if(t>=24) return "TRUNG TUYEN";
        return "TRUOT";
    }
}

public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.next();
        sc.nextLine();
        String ten = sc.nextLine();
        float t = sc.nextFloat();
        float l = sc.nextFloat();
        float h = sc.nextFloat();
        Thisinh a = new Thisinh(ma, ten, t, l, h);
        System.out.printf(a.maString+" "+a.tenString+" ");
        if(a.diemuutien()==(int)a.diemuutien()) System.out.printf((int)a.diemuutien() + " ");
        else System.out.printf(a.diemuutien()+ " ");
        if(a.tongdiem() == (int)a.tongdiem()){
             System.out.printf((int)a.tongdiem()+" "+a.trangthai());
        }
        else  System.out.printf(a.tongdiem()+" "+a.trangthai());
        System.out.println("");
    }
}