package nhap;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


class Pair<T1, T2> {
    T1 a;
    T2 b;

    public Pair(T1 a, T2 b) {
        this.a = a;
        this.b = b;
    }
    
    public boolean snt(int n){
        if (n < 2) return false;
        for (int i=2; i<= (int)Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public boolean isPrime(){
        if (snt((Integer) a) && snt((Integer) b)) return true;
        return false;
    }
    
    @Override
    public String toString(){
        return a + " " + b;
    }
}


public class Nhap {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}