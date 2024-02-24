import java.util.Scanner;

public class J03010_Diachiemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String[] tong = new String[t];
        int idx = 0;
        while(t-->0){
            String s = sc.nextLine();
            s = s.trim().toLowerCase();
            String[] tmp = s.split("\\s+");
            String word = tmp[tmp.length-1];
            for(int i=0;i<tmp.length-1;i++){
                word += String.valueOf(tmp[i].charAt(0));
            }
            tong[idx++] = word;
        }
        int n = tong.length;
        for(int i=0;i<n-1;i++){
            int h = 2;
            for(int j=i+1;j<n;j++){
                if(tong[i].equals(tong[j])) tong[j] += String.valueOf(h++);
            }
        }
        for(String v:tong){
            System.out.println(v + "@ptit.edu.vn");
        }
    }
}
