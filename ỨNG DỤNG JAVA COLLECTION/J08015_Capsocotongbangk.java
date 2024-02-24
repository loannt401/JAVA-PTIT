package nhap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            long tong = sc.nextLong();
            long [] a = new long[n];
            Map<Long, Integer> map = new HashMap<>();
            for (int i=0;i<n;i++){
                a[i] = sc.nextLong();
                long x = tong - a[i];
                if (!map.containsKey(x)){
                    map.put(x, 1);
                }
                else {
                    map.put(x, map.get(x) + 1);
                }
            }
            long dem = 0;
            for (int i=0;i<n;i++){
                if (map.containsKey(a[i])){
                    dem += (long) map.get(a[i]);
                }
                if (a[i] + a[i] == tong && map.get(a[i]) >= 2){
                    dem --;
                }
            }
            System.out.println(dem / 2);
        }
    }
}

/*

4
4 6
1 5 7 -1
5 6
1 5 7 -1 5
4 2
1 1 1 1
13 11
10 12 10 15 -1 7 6 5 4 2 1 1 1

*/