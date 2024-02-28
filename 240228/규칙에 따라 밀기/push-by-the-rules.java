import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] b = sc.nextLine().toCharArray();

        for(char i:b) {
            if(i == 'L') {
                a = a.substring(1, a.length()) + a.substring(0, 1);
            }
            else if(i == 'R') {
                a = a.substring(a.length()-1, a.length()) + a.substring(0, a.length()-1);
            }
        }

        System.out.print(a);
    }
}