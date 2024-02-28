import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        int tmp = a.indexOf("e");
        a = a.substring(0, tmp) + a.substring(tmp+1, a.length());

        System.out.print(a);
    }
}