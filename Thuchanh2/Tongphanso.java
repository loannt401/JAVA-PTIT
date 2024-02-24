import java.util.Scanner;

class Phanso {
    long tuSo;
    long mauSo;
    static Scanner sc = new Scanner(System.in);

    void nhapPS(){
        tuSo = sc.nextLong();
        mauSo = sc.nextLong();
    }

    void hienThiPS(){
        System.out.println(tuSo + "/" + mauSo);
    }
    
    void toGianPS(){
        long a=tuSo;
        long b=mauSo;
        while(a!=0){
            long x=a;
            a=b%a;
            b=x;
        }
        tuSo/=b;mauSo/=b;
    }
    
    public void congPS(Phanso another){
        tuSo = tuSo*another.mauSo + another.tuSo * mauSo;
        mauSo = mauSo * another.mauSo;
    }
}

public class NHAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Phanso a = new Phanso();
        Phanso b = new Phanso();
        a.nhapPS(); b.nhapPS();
        a.toGianPS(); b.toGianPS();
        a.congPS(b);
        a.toGianPS();
        a.hienThiPS();
    }
    
}
