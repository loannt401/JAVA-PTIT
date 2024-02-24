import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;



class Danhsachmonhoc {
    String ma, ten, ht;
    public Danhsachmonhoc(String ma, String ten, String ht){
        this.ma = ma;
        this.ten = ten;
        this.ht = ht;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + ht;
    }
}

public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("MONHOC.in");
        Scanner sc = new Scanner(f);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            String m = sc.next();
            sc.nextLine();
            String t = sc.nextLine();
            String h = sc.nextLine();
            Danhsachmonhoc a = new Danhsachmonhoc(m, t, h);
            s[i] = a.toString();
        }
        Arrays.sort(s);
        for(int i=0;i<n;i++){
            System.out.println(s[i]);
        }
    }
    
}


