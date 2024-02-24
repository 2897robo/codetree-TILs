import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int min = 100;

        for(int i=0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }

        for(int i=1; i<a.length; i++) {
            int tmp = a[i] - a[i-1];
            if(tmp<min) {
                min = tmp;
            }
        }

        System.out.print(min);
    }
}