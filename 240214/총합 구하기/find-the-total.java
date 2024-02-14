import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tmp = a;
        int sum = 0;

        while(tmp <= b) {
            if(tmp%6==0 && tmp%8!=0) {
                sum += tmp;
            }
            tmp++;
        }

        System.out.print(sum);
    }
}