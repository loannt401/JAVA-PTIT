import java.util.Scanner;

class TS {
    String ten;
    String ns;
    double mon1, mon2, mon3;
    double tongdiem = 0;
    static Scanner sc = new Scanner(System.in);
    public void input(){
        ten = sc.nextLine();
        ns = sc.next();
        mon1 = sc.nextDouble();
        mon2 = sc.nextDouble();
        mon3 = sc.nextDouble();
    }
    public void output(){
        tongdiem = (mon1 + mon2 + mon3);
        tongdiem = Math.round(tongdiem*10)/10;
        System.out.println(ten + " " + ns + " " + tongdiem);
    }
}

public class THISINH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TS a = new TS();
        a.input();
        a.output();
    }
    
}
