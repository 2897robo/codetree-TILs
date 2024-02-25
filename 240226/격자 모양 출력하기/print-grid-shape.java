import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][n];
        for(int i=0; i<m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr[x-1][y-1] = x*y;
        }

        for(int[] i:arr) {
            for(int j:i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}