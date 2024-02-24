import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Sinhvien {
    String msv = "B20DCCN001";
    String ten, lop, ns;
    float gpa;
    public Sinhvien(){
        ten = "";
        lop = "";
        ns = "";
        gpa = 0;
    }
    Scanner sc = new Scanner(System.in);
    public void input(){
        ten = sc.nextLine();
        lop = sc.next();
        ns = sc.next();
        gpa = sc.nextFloat();
    }
    public void output(){
        if(ns.charAt(2) != '/') ns = "0" + ns;
        if(ns.charAt(5) != '/') ns = ns.substring(0,3) + "0" + ns.substring(3);
        System.out.printf(msv + " " + ten + " " + lop + " " + ns + " ");
        System.out.printf("%.2f",gpa);
        System.out.println();
    }
}

public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sinhvien a = new Sinhvien();
        a.input(); a.output();
    }
    
}