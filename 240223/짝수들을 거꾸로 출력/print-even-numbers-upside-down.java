import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            array[i] = a;
        }

        for(int i=array.length; i>0; i--) {
            if(array[i-1]%2==0)
                System.out.print(array[i-1] + " ");
        }
    }
}