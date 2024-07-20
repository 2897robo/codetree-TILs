import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        while (true) {
            String tmp = sc.nextLine();
            if (tmp.equals("0")) {
                break; // '0'이 입력되면 루프 종료
            }
            strings.add(tmp); // 문자열을 리스트에 추가
        }

        // 전체 문자열 개수 출력
        System.out.println(strings.size());

        // 홀수 번째 문자열 출력 (0-indexed이므로 0, 2, 4 ...)
        for (int i = 0; i < strings.size(); i++) {
            if (i % 2 == 0) { // 홀수 번째 (1, 3, 5...)는 0-indexed에서 짝수 인덱스
                System.out.println(strings.get(i));
            }
        }
    }
}