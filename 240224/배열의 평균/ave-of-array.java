import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[2][4];
        
        // 배열 입력 받기
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        
        // 가로 평균 계산 및 출력
        getRowAverages(array);
        
        // 세로 평균 계산 및 출력
        getColumnAverages(array);
        
        // 전체 평균 계산 및 출력
        getTotalAverage(array);
    }
    
    // 가로 평균 계산하는 메소드
    private static void getRowAverages(int[][] array) {
        double sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                sum += array[i][j];
            }
            System.out.printf("%.1f ", sum / 4);
            sum = 0;
        }
        System.out.println();
    }
    
    // 세로 평균 계산하는 메소드
    private static void getColumnAverages(int[][] array) {
        for (int j = 0; j < 4; j++) {
            double sum = 0;
            for (int i = 0; i < 2; i++) {
                sum += array[i][j];
            }
            System.out.printf("%.1f ", sum / 2);
            sum = 0;
        }
        System.out.println();
    }
    
    // 전체 평균 계산하는 메소드
    private static void getTotalAverage(int[][] array) {
        double sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                sum += array[i][j];
            }
        }
        System.out.printf("%.1f", sum / 8);
    }
}