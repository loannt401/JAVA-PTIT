package nhap;

import java.util.Scanner;
import java.util.Stack;

public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            Stack<Integer> st = new Stack<>();
            int [] a = new int[n];
            for (int i=0; i<n; i++) a[i] = sc.nextInt();
            for (int i=0; i< n; i++){
                while (!st.isEmpty()){
                    int idx = st.peek();
                    if (a[idx] > a[i]){
                        break;
                    }
                    st.pop();
                }
                if (st.isEmpty()) System.out.print((i + 1) + " ");
                else System.out.print((i-st.peek()) + " ");
                st.push(i);
            }
            System.out.println("");
        }
    }
}

/*

1
7
100 80 60 70 60 75 85


*/