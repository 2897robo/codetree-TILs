import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int cnt = 0;
        for(int i=0; i<= a.length()-b.length(); i++) {
            String sub = a.substring(i, i+b.length());
            if(sub.equals(b)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}