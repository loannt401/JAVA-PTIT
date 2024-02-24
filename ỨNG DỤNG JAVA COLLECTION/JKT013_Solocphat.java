package nhap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("6");
            q.add("8");
            Stack<String> st = new Stack<>();
            st.add("6");
            st.add("8");
            while (true) {
                String x = q.poll();
                if (x.length() + 1 > n) break;
                st.add(x + "6");
                st.add(x + "8");
                q.add(x + "6");
                q.add(x + "8");
            }
            System.out.println(st.size());
            while (!st.isEmpty()){
                System.out.print(st.peek() + " ");
                st.pop();
            }
            System.out.println("");
        }
    }
}


/*

2
2
3

*/