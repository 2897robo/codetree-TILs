import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String tmp = sc.nextLine();

        char[] a = new char[tmp.length()];
        int cnt = 0;

        for(int i=0; i<tmp.length(); i++) {
            a[i] = tmp.charAt(i);
        }

        for(int i=0; i<a.length; i++) {
            if(a[i] != ' ') {
                System.out.print(a[i]);
                cnt++;
            }
            if(cnt%5 == 0) {
                System.out.println();
            }
        }
    }
}