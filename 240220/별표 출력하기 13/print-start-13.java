import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;

        for(int i=n; i>0; i--) {
            for(int j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for(int j=0; j<=k; j++) {
                System.out.print("* ");
            }
            System.out.println();
            k++;
            if(k==n)
                break;
        }
    }
}