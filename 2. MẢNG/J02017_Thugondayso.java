import java.util.Scanner;
import java.util.Stack;

/**
 * J02017_Thugondayso
 */
public class J02017_Thugondayso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        Stack<Integer> stk = new Stack<Integer>();
        for(int x:a){
            if(stk.isEmpty()) stk.push(x);
            else {
                if((x + stk.peek())%2 == 0){
                    stk.pop();
                }
                else stk.push(x);
            }
        }
        System.out.println(stk.size());
    }
}