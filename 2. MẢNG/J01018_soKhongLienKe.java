package JAVA;

import java.util.Scanner;

public class J01018_soKhongLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            int tong = 0;
            String s = sc.next();
            boolean ok = true;
            for(int i=0;i<s.length();i++){
                int num1 = Integer.parseInt(String.valueOf(s.charAt(i)));
                tong += num1;
                if(i != s.length()-1){
                    int num2 = Integer.parseInt(String.valueOf(s.charAt(i+1)));
                    if((num1 - num2 != 2) && (num2 - num1 !=2)){
                        ok = false;
                        break;
                    }
                }
            }
            if(tong % 10 != 0) ok = false;
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
