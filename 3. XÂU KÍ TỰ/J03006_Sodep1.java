import java.util.Scanner;

public class J03006_Sodep1 {
    public static boolean soThuanNghich(String s){
        String dao = new StringBuffer(s).reverse().toString();
        return s.equals(dao);
    }
    public static boolean soChan(String s){
        for(char c:s.toCharArray()){
            int num = Integer.parseInt(String.valueOf(c));
            if(num%2!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            String s = sc.next();
            if(soChan(s)==true && soThuanNghich(s)==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
