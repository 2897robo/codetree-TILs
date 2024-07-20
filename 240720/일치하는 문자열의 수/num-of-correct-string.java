import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String answer = sc.next();
        sc.nextLine();
        
        String[] tmp = new String[n];
        int cnt = 0;
        for(int i=0; i<n; i++) {
            tmp[i] = sc.nextLine();
            if(answer.equals(tmp[i])) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}