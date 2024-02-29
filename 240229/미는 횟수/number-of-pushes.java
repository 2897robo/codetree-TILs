import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.print(StrShift(a,b));
    }

    public static int StrShift(String a, String b) {
        int cnt = 0;
        
        while(true) {
            a = a.charAt(a.length()-1) + a.substring(0, a.length()-1);
            cnt++;
            if(a.equals(b)) {
                break;
            }
            else if(cnt > 99) {
                return -1;
            }
        }

        return cnt;
    }
}