import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        for(int i=0; i<m; i++) {
            int n = sc.nextInt();
            int cnt = 0;
            while(n!=1) {
                if(n%2==0) {
                    n = n/2;
                    cnt++;
                }
                else if(n%2==1) {
                    n = n*3+1;
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}