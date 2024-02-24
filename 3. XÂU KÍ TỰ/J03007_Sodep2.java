import java.util.Scanner;

public class J03007_Sodep2 {
    public static boolean soThuanNghich(String s){
        String dao = new StringBuffer(s).reverse().toString();
        return s.equals(dao);
    }
    public static boolean check(String s){
        int tong = 0;
        if(s.charAt(0)!='8' || s.charAt(s.length()-1) != '8') return false;
        for(char c:s.toCharArray()){
            int num = Integer.parseInt(String.valueOf(c));
            tong += num;
        }
        if(tong%10!=0) return false;
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

