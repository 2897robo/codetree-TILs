import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        a[0] = sc.nextInt();
        a[1] = sc.nextInt();

        for(int i=2; i<10; i++) {
            a[i] = a[i-1] + 2*a[i-2];
        }
        for(int i:a) {
            System.out.print(i + " ");
        }
    }
}