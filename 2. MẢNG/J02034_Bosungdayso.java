import java.util.Scanner;

public class J02034_Bosungdayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        int i=0;
        int j=1;
        boolean ok = true;
        while(i<n && j<a[n-1]){
            if(a[i] == j){
                i++; j++;
            }
            else {
                System.out.println(j);
                j++;
                ok = false;
            } 
        }
        if(ok) System.out.println("Excellent!");
    }
}
