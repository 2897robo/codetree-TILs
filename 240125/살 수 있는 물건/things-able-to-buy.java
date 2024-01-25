import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n >= 3000)
            System.out.print("book");
        else if(1000 <= n && n < 3000)
            System.out.print("mask");
        else if(1000>n)
            System.out.print("no");
    }
}