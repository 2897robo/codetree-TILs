import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int num = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num);
                num--;
                if (num == 0)
                    num = 9;
            }
            System.out.println();
            // 맨 뒷자리 숫자를 줄여나감
        }
    }
}