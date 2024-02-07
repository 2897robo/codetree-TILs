import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 쌍 입력
        int firstAge = sc.nextInt();
        String firstGender = sc.next();

        // 두 번째 쌍 입력
        int secondAge = sc.nextInt();
        String secondGender = sc.next();

        // 조건을 만족하는 경우 "1", 아닌 경우 "0" 출력
        System.out.print((firstAge >= 19 || secondAge >= 19) && (firstGender.equals("M") || secondGender.equals("M")) ? "1" : "0");
    }
}