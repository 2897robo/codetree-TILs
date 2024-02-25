import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for(int i=0; i<n; i++) {
            a[i][0] = 1;
            a[0][i] = 1;
        }

        for(int i=1; i<n; i++) {
            for(int j=1; j<n; j++) {
                a[i][j] = a[i-1][j-1] + a[i-1][j] + a[i][j-1];
            }
            
        }

        for(int[] i:a) {
            for(int j:i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}