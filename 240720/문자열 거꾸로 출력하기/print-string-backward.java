import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp;

        while (true) {
            tmp = sc.nextLine();
            if (tmp.equals("END")) {
                break;
            }
            // StringBuilder를 사용하여 문자열을 역순으로 변환
            String reversed = new StringBuilder(tmp).reverse().toString();
            System.out.println(reversed);
        }
    }
}