import java.util.Scanner;

/**
 * J01025_HinhVuong
 */
public class J01025_HinhVuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][4];
        for(int i=0;i<2;i++)
            for(int j=0;j<4;j++) a[i][j] = sc.nextInt();
        int xp = (a[0][2]>a[1][2])?a[0][2]:a[1][2];
        int xt = (a[0][0]<a[1][0])?a[0][0]:a[1][0];
        int canh1 = xp - xt;
        int yp = (a[0][3]>a[1][3])?a[0][3]:a[1][3];
        int yt = (a[0][1]<a[1][1])?a[0][1]:a[1][1];
        int canh2 = yp - yt;
        int canh = (canh1>canh2)?canh1:canh2;
        System.out.println(canh*canh);
    }
}