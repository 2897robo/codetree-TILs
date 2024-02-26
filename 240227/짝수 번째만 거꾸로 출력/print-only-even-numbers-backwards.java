import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        String s = "";
        
        for(int i=1; i<c.length(); i+=2) {
            s += c.charAt(i);
        }

        for(int i=s.length()-1; i>=0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}