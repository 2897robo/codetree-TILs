import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 쌍 입력
        int firstAge = sc.nextInt();
        char firstGender = sc.next().charAt(0);

        // 두 번째 쌍 입력
        int secondAge = sc.nextInt();
        char secondGender = sc.next().charAt(0);

        // 조건을 만족하는 경우 "1", 아닌 경우 "0" 출력
        System.out.print((firstAge >= 19 || secondAge >= 19) && (firstGender == 'M' || secondGender == 'M') ? "1" : "0");
    }
}