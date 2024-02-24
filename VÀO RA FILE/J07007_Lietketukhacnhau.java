package nhap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


class WordSet {
    
    Set<String> set = new TreeSet<>();
    
    public WordSet (String aString) throws FileNotFoundException{
        File file = new File("VANBAN.in");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()){
            String s = sc.next().toLowerCase();
            set.add(s);
        }
    }
    
    @Override
    public String toString(){
        String s = "";
        for(String v : set){
            s += v + "\n";
        }
        return s;
    }
}

public class Nhap {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}