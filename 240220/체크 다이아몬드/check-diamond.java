import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 위쪽 다이아몬드 그리기
        for (int i = 1; i <= n; i++) {
            // 왼쪽 공백 출력
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // 별표 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // 줄 바꿈
            System.out.println();
        }

        // 아래쪽 다이아몬드 그리기
        for (int i = n - 1; i >= 1; i--) {
            // 왼쪽 공백 출력
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // 별표 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // 줄 바꿈
            System.out.println();
        }

        sc.close();
    }
}