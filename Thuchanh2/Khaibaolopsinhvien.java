import java.util.Scanner;

class TS {
    String msv;
    String ten;
    String lop;
    String ns;
    float gpa;
    public TS(){
        msv = "";
        ten = "";
        lop = "";
        ns = "";
        gpa = 0;
    }
    static Scanner sc = new Scanner(System.in);
    public void input(){
        ten = sc.nextLine();
        lop = sc.next();
        ns = sc.next();
        gpa = sc.nextFloat();
       
    }
    public void output(){
        if(ns.charAt(1) == '/') ns = "0" + ns;
        if(ns.charAt(4) == '/') ns = ns.substring(0,3) + "0" + ns.substring(3);
        System.out.printf("B20DCCN001" + " " + ten + " " + lop + " " + ns + " ");
        System.out.printf("%.2f", gpa);
        System.out.println();
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

