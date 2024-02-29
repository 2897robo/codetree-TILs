import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intarr = new int[n];

        for(int i=0; i<n; i++) {
            intarr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i:intarr) {
            sum += i;
        }

        String tmp = Integer.toString(sum);

        System.out.print(tmp.substring(1,tmp.length()) + tmp.charAt(0));
    }
}