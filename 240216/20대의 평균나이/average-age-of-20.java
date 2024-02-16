import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;
        int age;

        while(true) {
            age = sc.nextInt();

            if(age<20 || age>=30)
                break;

            sum += age;
            cnt++;
        }

        double avg = (double) sum/cnt;

        System.out.printf("%.2f", avg);

    }
}