import java.util.Scanner;

class Phanso {
    private long ts;
    private long ms;
    Scanner sc = new Scanner(System.in);
    public Phanso(){
        ts = sc.nextLong();
        ms = sc.nextLong();
    }
    public long uscln(long a, long b){
        if(b==0) return a;
        return uscln(b, a%b);
    }
    public void display(){
        long x = uscln(ts, ms);
        ts /= x;
        ms /= x;
        System.out.println(ts + "/" + ms);
    }
}

public class NHAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Phanso p = new Phanso();
        p.display();
    }
    
}
