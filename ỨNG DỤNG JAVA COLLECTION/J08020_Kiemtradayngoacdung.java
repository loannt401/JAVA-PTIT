package nhap;

import java.util.Scanner;
import java.util.Stack;

public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String s = sc.next();
            Stack<Character> st = new Stack<>();
            for(char c : s.toCharArray()){
                if (!st.isEmpty()) {
                    if ( c == ')' && st.peek() =='(') st.pop();
                    else if (c == ']' && st.peek() == '[') st.pop();
                    else if (c == '}' && st.peek() == '{') st.pop();
                    else st.push(c);
                }
                else st.push(c);
            }
            if(st.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

/*

2
[()]{}{[()()]()}
[(])

*/