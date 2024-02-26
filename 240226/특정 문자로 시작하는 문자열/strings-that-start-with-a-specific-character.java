import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];

        sc.nextLine();

        for(int i=0; i<n; i++) {
            a[i] = sc.nextLine();
        }
        char c = sc.next().charAt(0);
        
        int cnt = 0;
        double sum = 0;

        for(int i=0; i<n; i++) {
            if(a[i].charAt(0) == c) {
                cnt++;
                sum += a[i].length();
            }
        }

        System.out.printf("%d %.2f", cnt, sum/cnt);
    }
}