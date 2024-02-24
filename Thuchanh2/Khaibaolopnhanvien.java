import java.util.Scanner;

class TS {
    String mnv = "00001";
    String ten, gt, ns, dc, mst, nkhd;
    static Scanner sc = new Scanner(System.in);
    public void input(){
        ten = sc.nextLine();
        gt = sc.next();
        ns = sc.next();
        sc.next();
        dc = sc.nextLine();
        mst = sc.next();
        nkhd = sc.next();
       
    }
    public void output(){
        if(ns.charAt(1) == '/') ns = "0" + ns;
        if(ns.charAt(4) == '/') ns = ns.substring(0,3) + "0" + ns.substring(3);
        System.out.println(mnv + " " + ten + " " + ns + " " + dc + " " + mst + " " + nkhd);
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
