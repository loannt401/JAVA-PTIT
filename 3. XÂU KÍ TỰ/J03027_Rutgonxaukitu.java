package JAVA;

import java.util.Scanner;
import java.util.Stack;

public class J03027_Rutgonxaukitu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<String> st = new Stack<String>();
        for(int i=s.length()-1;i>=0;i--){
            String v = String.valueOf(s.charAt(i));
            if(st.isEmpty()) st.push(v);
            else {
                if(st.peek().equals(v)) st.pop();
                else st.push(v);
            }
        }
        if(st.isEmpty()) System.out.println("Empty String");
        else {
            while(!st.isEmpty()){
                System.out.print(st.peek());
                st.pop();
            }
            System.out.println();
        }
    }
}
