package nhap;

import java.util.Scanner;
import java.util.Stack;

public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int [] a = new int[n];
            int [] b = new int[n];
            Stack<Integer> st = new Stack<>();
            for (int i=0; i< n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i=n-1; i>=0;i--){
                while (!st.isEmpty()){
                    if (st.peek() > a[i]) break;
                    else st.pop();
                }
                if(st.isEmpty()) {
                    st.push(a[i]);
                    a[i] = -1;
                }
                else {
                    int x = a[i];
                    a[i] = st.peek();
                    st.push(x);
                }
            }
            
            for(int x: a) {
                System.out.print(x +" ");
            }
            System.out.println("");
        }
    }
}


/*

3
4
4 5 2 25
3
2 2 2
4
4 4 5 5

*/