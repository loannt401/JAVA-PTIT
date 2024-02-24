
package codeptit;

import java.util.Scanner;





public class CodePtit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] a = new int[30];
        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i) - 'a';
            a[idx] += 1;
        }
        int dem = 0;
        for (int i=0;i<a.length; i+=1){
            if (a[i] > 0) dem +=1;
        }
        System.out.println(dem);
    }
}


/*
banana

*/