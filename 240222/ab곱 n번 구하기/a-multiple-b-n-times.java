import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int tmp = 1;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int j = a; j <= b; j++) {
                tmp = tmp * j;
                if(j==b) {
                    System.out.println(tmp);
                    tmp = 1;
                }
            }

            
        }
    }
}