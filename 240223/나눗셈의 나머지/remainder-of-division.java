import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] dvd = new int[b];
        int[] cnt = new int[b];

        for(int i=0;i<dvd.length;i++) {
            dvd[i] = i;
            cnt[i] = 0;
        }

        while(a>1) {
            for(int i=0; i<dvd.length; i++) {
                if(a%b == dvd[i]) {
                    cnt[i]++;
                }
                
            }
            
            a = a/b;
        }

        int sum = 0;

        for(int i=0; i<dvd.length; i++) {
            sum = sum + cnt[i] * cnt[i];
        }

        System.out.print(sum);
    }
}