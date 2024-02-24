import java.util.Scanner;

public class J02011_Sapxepchon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        for(int i=0;i<n-1;i++){
            int min_val = a[i];
            int min_idx = i;
            for(int j=i+1;j<n;j++){
                if(min_val > a[j]){
                    min_val = a[j];
                    min_idx = j;
                }
            }
            int temp = a[i];
            a[i] = min_val;
            a[min_idx] = temp;

            System.out.print("Buoc "+ (i+1)+": ");
            for(int x:a) System.out.print(x + " ");
            System.out.println();
        }
    }
}
