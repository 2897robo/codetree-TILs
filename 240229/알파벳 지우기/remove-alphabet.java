import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int tmp1 = StrToInt(a);
        int tmp2 = StrToInt(b);

        int sum = tmp1+tmp2;
        System.out.print(sum);
    }

    public static int StrToInt(String temp) {
        String intStr = temp.replaceAll("[^0-9]", "");
        return Integer.parseInt(intStr);
    }
}