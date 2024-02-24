import java.util.Scanner;

public class J02014_Diemcanbang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            int n = sc.nextInt();
            int[] a = new int[n];
            int tong = 0;
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                tong += a[i];
            }
            int nua = a[0];
            int ok = -1;
            for(int i=1;i<n-1;i++){
                int x = (tong - a[i])/2;
                if(nua == x){
                    ok = i+1;
                    break;
                }
                else nua += a[i];
            }
            System.out.println(ok);

        }
    }
}
