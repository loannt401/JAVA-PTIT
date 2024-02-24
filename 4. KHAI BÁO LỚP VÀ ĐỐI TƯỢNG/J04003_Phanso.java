import java.util.Scanner;

class J04003_Phanso {
    private long tuso;
    private long mauso;
    Scanner sc = new Scanner(System.in);
    public J04003_Phanso(){
        tuso = sc.nextLong();
        mauso = sc.nextLong();
    }
    public long uscln(long a, long b){
        if(b==0) return a;
        return uscln(b, a%b);
    }
    public void display(){
        long x = uscln(tuso, mauso);
        tuso = tuso/x;
        mauso = mauso/x;
        System.out.println(tuso + "/" + mauso);
    }
}

public class phanso{
    public static void main(String[] args) {
        J04003_Phanso p = new J04003_Phanso();
        p.display();
    }
}