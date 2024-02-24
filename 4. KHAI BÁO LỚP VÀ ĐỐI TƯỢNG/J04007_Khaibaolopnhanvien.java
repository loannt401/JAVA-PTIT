import java.util.Scanner;

/**
 *
 * @author Admin
 */
 class Nhanvien {
    String mnv = "00001";
    String ten, gt, ns, dc, mst, nkhd;
    public Nhanvien(){
        ten = gt = dc = mst = nkhd = "";
    }
    Scanner sc = new Scanner(System.in);
    public void input(){
        ten = sc.nextLine();
        gt = sc.next();
        ns = sc.next();
        sc.nextLine();
        dc = sc.nextLine();
        mst = sc.next();
        nkhd = sc.next();
    }
    public void output(){
        System.out.println(mnv + " " + ten + " " + gt + " " + ns + " " + dc + " " + mst + " " + nkhd);
    }
}

public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nhanvien a = new Nhanvien();
        a.input(); a.output();
    }
    
}