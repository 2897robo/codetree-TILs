import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] n = new int[10];
        int tmp=0;

        for(int i=0; i<10; i++) {
            n[i] = sc.nextInt();
            if(n[i]%3 == 0) {
                tmp = n[i-1];
                break;
            }
        }

        System.out.print(tmp);
        
    }
}