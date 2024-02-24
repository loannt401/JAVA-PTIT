import java.util.Scanner;

public class J02021_Lietketohop2 {
    public static int[] a = new int[15];
    public static int n;
    public static int k;
    public static boolean ok;
    public static void khoiTao(){
        for(int i=1;i<=k;i++) a[i] = i;
    }
    public static void sinh(){
        int i = k;
        while(i>0 && a[i] == n-k+i) i--;
        if(i == 0) ok = false;
        else {
            a[i]++;
            for(int j=i+1;j<=k;j++) a[j] = a[j-1] + 1;
        }


    }
    public static void in(){
        for(int i=1;i<=k;i++) System.out.print(a[i]);
        System.out.print(" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        khoiTao();
        ok = true;
        int dem = 0;
        while(ok){
            in();
            dem++;
            sinh();
        }
        System.out.println();
        System.out.println("Tong cong co "+dem+" to hop");

    }
}
