
package nhap;

import java.util.Scanner;
import java.util.Stack;

public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while (t-->0){
            String s = sc.next();
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            int dem = 0;
            for(int i=0;i<s.length(); i++){
                if (s.charAt(i) == '(') st.push(i);
                else {
                    if (st.size() > 1 && s.charAt(st.peek()) == '('){
                        st.pop();
                        dem = Math.max(dem, i - st.peek());
                    }
                    else st.push(i);
                }
            }
            System.out.println(dem);
        }
        
    }
}

/*

3
((()
)()())
()(()))))

*/