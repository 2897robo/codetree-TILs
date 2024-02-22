import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = n;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=k; j++) {
                System.out.printf("%d * %d = %d", i, j, i*j);
                if(j != k) {
                    System.out.print(" / ");
                }
            }
            k--;
            System.out.println();
        }

        sc.close();
    }
}