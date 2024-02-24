import java.util.Scanner;

/**
 * J03004_Chuanhoahoten1
 */
public class J03005_Chuanhoaxauhoten2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            s = s.trim().toLowerCase();
            String temp[] = s.split("\\s+");
            for(int i=1;i<temp.length;i++){
                temp[i] = temp[i].substring(0,1).toUpperCase() + temp[i].substring(1);
            }
            temp[0] = temp[0].toUpperCase();
            for(int i=1;i<temp.length;i++){
                System.out.print(temp[i]);
                if(i<temp.length-1) System.out.print(" ");
            }
            System.out.print(", " + temp[0]);

            System.out.println();
        }
    }
}

