import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char alpha = 'A';

        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                System.out.print("  ");
            }

            for(int j=0; j<n-i; j++) {
                System.out.printf("%s ", alpha++);
                if(alpha == 'Z')
                    alpha = 'A';
            }
            System.out.println();
        }
    }
}