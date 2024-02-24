

import java.util.Scanner;


class Nhanvien {
    public static int dem = 1;
    String mnv, ten, chucvu;
    int luong, songaycong;
    public Nhanvien(String ten, int luong, int songaycong, String chucvu){
        if(dem<10){
            mnv = "NV" + "0" + String.valueOf(dem);
        }
        else mnv = "NV" + String.valueOf(dem);
        this.ten = ten;
        this.luong = luong;
        this.songaycong = songaycong;
        this.chucvu = chucvu;
        dem+=1;
    }
    public int luongthang(){
        return luong*songaycong;
    }
    public int thuong(){
        if(this.songaycong>=25) return (int)((0.2)*luongthang());
        if(this.songaycong>=22) return (int)((0.1)*luongthang());
        return 0;
    }
    public int phucap(){
        if(this.chucvu.equals("GD")) return (int)25e4;
        if(this.chucvu.equals("PGD")) return (int)2e5;
        if(this.chucvu.equals("TP")) return (int)18e4;
        return (int)15e4;
    }
    public int thunhap(){
        return luongthang()+thuong() + phucap();
    }
}



/**
 *
 * @author Admin
 */
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        int l = sc.nextInt();
        int n = sc.nextInt();
        String cv = sc.next();
        Nhanvien a = new Nhanvien(t,l,n,cv);
        System.out.println(a.mnv+" "+a.ten+" "+a.luongthang()+" "+a.thuong()+" "+a.phucap()+" "+a.thunhap());
    }
}