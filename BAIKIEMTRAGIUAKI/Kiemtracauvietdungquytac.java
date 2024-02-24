package BAIKIEMTRAGIUAKI;

import java.util.Scanner;
import java.util.Stack;

public class Kiemtracauvietdungquytac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            
            String s = sc.nextLine();
            Stack <String> st = new Stack<String>();
            boolean ok = true;
            for(char c:s.toCharArray()){
                String kt = c + "";
                if(c == '(' || c == '['){
                    st.push(kt);
                }
                else if(c == ')' && c == ']'){
                    if(st.size() == 0) {
                        ok = false;
                        break;
                    }
                    else if(c == ')' && st.peek().equals("(")){
                        st.pop();
                    }
                    else if(c == ']' && st.peek().equals("[")){
                        st.pop();
                    }
                }
                
            }
            if(ok){
                if(st.size() == 0) System.out.println("YES");
            else System.out.println("NO");
            }
            else System.out.println("NO");
            
        }
    }
}
