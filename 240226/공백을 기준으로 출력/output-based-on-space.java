import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] a = new String[2];

        for(int i=0; i<2; i++) {
            a[i] = sc.nextLine();
        }

        System.out.print(a[0].replaceAll(" ","") +  a[1].replaceAll(" ",""));
    }
}