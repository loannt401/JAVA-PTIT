import java.util.Scanner;

public class J01022_XauNhiPhan {
    public static long[] F = new long[93];
    public static boolean xauNhiPhan(int n, long k){
        if(n == 1) return false;
        if(n == 2) return true;
        if(k <= F[n-2]) return xauNhiPhan(n-2, k);
        return xauNhiPhan(n-1,k-F[n-2]);
    }
    public static void main(String[] args) {
        F[0] = 0; F[1] = 1;
        for(int i=2;i<=92;i++) F[i] = F[i-1] + F[i-2];
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            int n = sc.nextInt();
            long k = sc.nextLong();
            if(xauNhiPhan(n, k)) System.out.println(1);
            else System.out.println(0);

        }
    }
}
