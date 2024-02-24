import java.util.Scanner;
import java.util.Stack;

public class J03009_Tapturiengcuahaixau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String tmp1[] = s1.split(" ");
            String tmp2[] = s2.split(" ");
            
            int n = tmp1.length;
            for(int i=0;i<n;i++)
                for(int j=i+1;j<n;j++){
                    if(tmp1[i].compareTo(tmp1[j])<0){
                        String sw = tmp1[i];
                        tmp1[i] = tmp1[j];
                        tmp1[j] = sw;
                    }
                }

            Stack<String> st = new Stack<String>();
            for(int i=0;i<n;i++){
                if(st.isEmpty()) st.push(tmp1[i]);
                else {
                    if(!st.peek().equals(tmp1[i])) st.push(tmp1[i]);
                }
            }
 
            while(!st.isEmpty()){
                String word = st.peek();
                st.pop();
                boolean ok = true;
                for(String v:tmp2){
                    if(word.equals(v)) {
                        ok = false;
                        break;
                    }
                }
                if(ok) System.out.print(word + " ");
            }
            System.out.println();
        }
    }
}
