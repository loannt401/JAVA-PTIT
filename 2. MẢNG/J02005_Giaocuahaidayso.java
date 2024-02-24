import java.util.Scanner;

/**
 * J02005_Giaocuahaidayso
 */
public class J02005_Giaocuahaidayso {
    public static void sapXep(int[] a, int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        for(int i=0;i<m;i++) b[i] = sc.nextInt();
        sapXep(a, n); sapXep(b, m);
        int[] c = new int[n];
        int[] d = new int[m];
        int k=1;
        c[0] = a[0];
        for(int i=1;i<n;i++){
            if(a[i-1] != a[i]) c[k++] = a[i];
        } 
        d[0] = b[0];
        int h=1;
        for(int i=1;i<m;i++){
            if(b[i-1] != b[i]) d[h++] = b[i];
        }
        int i=0, j=0;
        while(i<k && j<h){
            if(c[i] == d[j]) {
                System.out.print(c[i] + " ");
                i++; j++;
            }
            else if(c[i] > d[j]) j++;
            else i++;
        }
        System.out.println();
    }
}