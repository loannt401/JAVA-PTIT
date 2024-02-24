import java.util.Scanner;

public class J02103_Tichmatranvoichuyenvicuano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int test = 1;
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] A = new int[n][m];
            int[][] B = new int[m][n];
            for(int i=0;i<n;i++)
                for(int j=0;j<m;j++){
                    A[i][j] = sc.nextInt();
                }
            for(int j=0;j<m;j++)
                for(int i=0;i<n;i++)
                    B[j][i] = A[i][j];
            //  A[n][m]     B[m][n]
            //  C[n][n]
            int[][] C = new int[n+1][n+1];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    C[i][j] = 0;
                    for(int k=0;k<m;k++){
                        C[i][j] = C[i][j] + A[i][k] * B[k][j]; 
                    }
                }
            }
            System.out.println("Test " + (test++) + ":");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
