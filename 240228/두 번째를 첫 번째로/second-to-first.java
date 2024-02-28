import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        char fir = a.charAt(0);
        char sec = a.charAt(1);

        char[] chars = a.toCharArray();
        for(int i=0; i<chars.length; i++) {
            if(chars[i]==sec) {
                chars[i] = fir;
            }
        }

        String result = new String(chars);

        System.out.print(result);
    }
}