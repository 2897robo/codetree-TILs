import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int fa = sc.nextInt();
        char fs = sc.next().charAt(0);
        int sa = sc.nextInt();
        char ss = sc.next().charAt(0);

        System.out.print((fa>=19||sa>=19)&&(fs=='M'||ss=='M')?"1":"0");
    }
}