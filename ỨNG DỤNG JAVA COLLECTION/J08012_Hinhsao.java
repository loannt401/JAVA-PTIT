package nhap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> mp = new HashMap<>();
        n--;
        for(int i=0;i<n;i++){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            if(!mp.containsKey(a1)){
                mp.put(a1, 1);
            }
            else {
                int x = mp.get(a1);
                ++x;
                mp.put(a1, x);
            }
            
            if(!mp.containsKey(a2)){
                mp.put(a2, 1);
            }
            else {
                int x = mp.get(a2);
                ++x;
                mp.put(a1, x);
            }
        } 
        int max_val = 0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int x = entry.getValue();
            if (max_val < x) max_val = x;
            
        }
        if(max_val == n) System.out.println("Yes");
        else System.out.println("No");

    }
}

/*

5
1 2
1 3
1 4
1 5


*/