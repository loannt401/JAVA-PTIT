import java.util.Scanner;

public class J02007_demSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = 0;
        while(t>0){
            t--;
            k++;
            int n = sc.nextInt();
            int[] a = new int[n];
            boolean[] ok = new boolean[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                ok[i] = true;
            }
            System.out.println("Test " + k +":");
            for(int i=0;i<n;i++){
                int dem = 1;
                if(ok[i]){
                    for(int j=i+1;j<n;j++){
                        if(a[i] == a[j]){
                            dem++;
                            ok[j] = false;
                        }
                    }
                    System.out.println(a[i] + " xuat hien "+dem+" lan");
                    ok[i] = false;
                }
            }
        }
    }
}
