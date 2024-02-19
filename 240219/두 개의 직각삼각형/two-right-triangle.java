import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 위쪽 삼각형 출력
        for (int i = 0; i < n; i++) {
            // 별표 출력
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            // 공백 출력
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            // 별표 출력
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }

        sc.close();
    }
}