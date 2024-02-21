import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;

        // 윗 부분 출력
        for (int i = 1; i <= n; i++) {
            // 첫 번째와 마지막 줄은 모두 별표로 채움
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }
            } 
            
            else {
                // 나머지 줄은 양 끝에 별표를 출력하고 사이를 공백으로 채움
                System.out.print("* ");
                for (int j = 0; j < k; j++) {
                    System.out.print("* ");
                }
                k++;
                for (int j = n; j > i; j--) {
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }
    }
}