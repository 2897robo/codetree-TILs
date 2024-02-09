import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 0;
        int a = 0;

        while(n>i) {
            a = sc.nextInt();
            i++;
            if(a%2 == 1 && a%3==0) {
                System.out.println(a);
            }
        }

    }
}