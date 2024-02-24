package JAVA;

import java.util.Scanner;

public class J03032_Daotu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String[] tmp = s.split(" ");
            for(int i=0;i<tmp.length;i++){
                String w = "";
                for(int j = tmp[i].length()-1;j>=0;j--){
                    w += String.valueOf(tmp[i].charAt(j));
                }
                tmp[i] = w;
            }
            for(String v:tmp){
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
