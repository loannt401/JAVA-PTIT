package nhap;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<Character> list = new LinkedList<>();
        int idx = -1;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c == '-'){
                if(idx != -1){
                    list.remove(idx);
                    idx--;
                }
            }
            else if (c == '<'){
                if (idx != -1) idx--;
            }
            else if (c == '>'){
                if (idx < list.size()-1) idx++;
            }
            else {
                idx ++;
                list.add(idx, c);
            }
        }
        for(char c : list){
            System.out.print(c);
        }
        System.out.println("");

    }
}

/*

<<PI<T>>Ta-

*/