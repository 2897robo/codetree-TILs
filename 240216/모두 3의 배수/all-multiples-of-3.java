import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        int tx = 0;

        for(int i=0;i<5;i++)
            a[i] = sc.nextInt();

        for(int i=0;i<5;i++) {
            if(a[i]%3==0) {
                tx=1;
            }
            else
                tx=0;
            if(tx==0)
                break;
        }

        System.out.print(tx);
    }
}