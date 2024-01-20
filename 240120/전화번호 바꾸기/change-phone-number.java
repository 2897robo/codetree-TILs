import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String p = sc.next();

        String tmp = p.substring(4,8);
        String back = p.substring(9);

        System.out.print("010-" + back + "-" + tmp);

        

    }
}