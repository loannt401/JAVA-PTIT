import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Teacher {
    String ma, ten;
    int luong;
   
    Scanner sc = new Scanner(System.in);
    public void input(){
        ma = sc.next();
        sc.nextLine();
        ten = sc.nextLine();
        luong = sc.nextInt();
    }
    public int bacluong(){
        return Integer.parseInt(ma.substring(2));
    }
    public int phucap(){
        String s = ma.substring(0,2);
        if(s.equals("HT")) return (int)2e6;
        if(s.equals("HP")) return (int)9e5;
        return (int)5e5;
    }
    public int thunhap(){
        return luong*bacluong() + phucap();
    }
    
}

public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher a = new Teacher();
        a.input();
        System.out.println(a.ma + " " + a.ten + " " + a.bacluong() + " " + a.phucap() + " " + a.thunhap());
    }
    
}