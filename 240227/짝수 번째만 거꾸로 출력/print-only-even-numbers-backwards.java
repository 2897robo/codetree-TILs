import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();

        for(int i=c.length()-1; i>=0; i=i-2) {
            System.out.print(c.charAt(i));
        }
    }
}