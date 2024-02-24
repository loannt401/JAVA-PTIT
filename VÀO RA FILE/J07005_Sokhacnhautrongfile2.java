package nhap;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Nhap {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream file = new FileInputStream("DATA.IN");
        DataInputStream sc = new DataInputStream(file);
        int[] a = new int[1000];
        for (int i=0; i<100000; i++){
            int x = sc.readInt();
            a[x]++;
        }
        for(int i=0; i<1000; i++){
            if(a[i] > 0) System.out.println(i + " " + a[i]);
        }
    }
}