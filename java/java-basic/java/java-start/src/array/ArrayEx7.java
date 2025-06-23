package array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[4][3];
        int sum, avg;
        sum = avg = 0;

        for (int row = 1; row <= arr.length; row++) {
            System.out.println(row+"번 학생의 성적을 입력하세요:");
            for (int column = 1; column <= arr[row].length; column++) {
                System.out.println("국어 점수: ");
                arr[row][column] = scanner.nextInt();
                System.out.println("영어 점수: ");
                arr[row][column] = scanner.nextInt();
                System.out.println("수학 점수: ");
                arr[row][column] = scanner.nextInt();
                sum += arr[row][column];

            }
            System.out.println(row + "번 학생의 총점: " + sum + ", 평균: " + avg);
        }


    }
}
