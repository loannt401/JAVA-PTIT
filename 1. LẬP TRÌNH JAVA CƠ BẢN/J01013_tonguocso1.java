import java.util.Scanner;

/**
 * J01013_tonguocso1
 */
public class J01013_tonguocso1 {
    static int MAX_VAL = (int)2e6;
    static int[] F = new int[MAX_VAL + 5];
    public static void uocSo(){
        for(int i=2;i*i<=MAX_VAL;i++){
            if(F[i] == 0){
                for(int j=i;j<=MAX_VAL;j+=i){
                    if(F[j] == 0) F[j] = i;
                }
            }
        }
        for(int i=2; i<=MAX_VAL;i++) {
            if(F[i] == 0) F[i] = i;
        }
    }
    public static long tongUoc(int n){
        long tong = 0;
        while(n>1){
            tong += F[n];
            n /= F[n];
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long tong = 0;
        uocSo();
        while(t-->0){
            int n = sc.nextInt();
            if(n ==0 || n==1) tong += n;
            else tong += tongUoc(n);
        }
        System.out.println(tong);
    }
}