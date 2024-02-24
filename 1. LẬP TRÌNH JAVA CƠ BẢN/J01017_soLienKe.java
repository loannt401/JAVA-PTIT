package JAVA;

import java.util.Scanner;

public class J01017_soLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            String s = sc.next();
            Boolean ok = true;
            for(int i=0;i<s.length()-1;i++){
                int num1 = Integer.parseInt(String.valueOf(s.charAt(i)));
                int num2 = Integer.parseInt(String.valueOf(s.charAt(i+1)));
                if((num1 - num2 != 1) && (num2 - num1 != 1)){
                    ok = false;
                    break;
                }
            }
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
