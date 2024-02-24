
package codeptit;

import java.util.Scanner;





public class CodePtit {
    
    public static boolean check1(String s){
        
        for(int i=0;i<4;i++){
            if (s.charAt(i) >= s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean check2(String s){
        for(int i=0;i<4;i++){
            if (s.charAt(i) != s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean check3(String s){
        if(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4)){
            return true;
        }
        return false;
    }
    
        public static boolean check4(String s){
            for(int i=0;i<4;i++){
                if (s.charAt(i) != '6' && s.charAt(i) != '8'){
                    return false;
                }
            }
            return true;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String s = sc.next();
            String st = s.substring(5,8) + s.substring(9);
            if(check1(st) == true || check2(st) == true || check3(st) == true || check4(st) == true){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        
    }
}


/*
7
29T1–123.45
29T1–555.55
29T1–222.33
29T1–686.88
29T1–123.33
29T1–555.54
29T1–606.88

*/