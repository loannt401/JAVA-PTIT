import java.util.Scanner;

public class J03008_Sodep3 {
    public static boolean soThuanNghich(String s){
        String dao = new StringBuffer(s).reverse().toString();
        return s.equals(dao);
    }
    public static boolean check(String s){
        for(char c:s.toCharArray()){
            if(c != '2' && c != '3' && c != '5' && c !='7') return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            String s = sc.next();
            if(check(s)==true && soThuanNghich(s)==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

