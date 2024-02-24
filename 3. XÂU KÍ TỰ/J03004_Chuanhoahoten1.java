import java.util.Scanner;

/**
 * J03004_Chuanhoahoten1
 */
public class J03004_Chuanhoahoten1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            s = s.trim().toLowerCase();
            String temp[] = s.split("\\s+");
            for(String w:temp){
                System.out.print(w.substring(0,1).toUpperCase() + w.substring(1) + ' ');
            }
            System.out.println();
        }
    }
}
