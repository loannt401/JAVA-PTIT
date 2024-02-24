package JAVA;

import java.util.Scanner;

/**
 * J01010_CatDoi
 */
public class J01010_CatDoi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t>0){
            t--;
            String s = scan.next();
            int ok = 1;
            for(int i=0;i<s.length(); i++){
                if(s.charAt(i)!='0'&& s.charAt(i)!='1' && s.charAt(i)!='8' && s.charAt(i)!='9'){
                    System.out.println("INVALID"); 
                    ok = 0;
                    break;
                }
                else{
                    s = s.replace('8','0');
                    s = s.replace('9','0');
                }
            }
            if(ok == 1) {
                int idx = s.indexOf("1");
                if(idx == -1) System.out.println("INVALID");
                else {
                    int idx_c = s.length();
                    String kq = s.substring(idx,idx_c);
                    System.out.println(kq);
                }
            }
            
        }
    }
}