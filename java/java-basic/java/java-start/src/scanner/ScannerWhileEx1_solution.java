package scanner;

import java.util.Scanner;

public class ScannerWhileEx1_solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine(); //그 다음 여기서 입력은 안 했지만 \n이게 사용자 입력으로 남아있음.
            //엔터만 하고 아무것도 없으니까 ""빈문자가 들어감. nexxtline은 한줄을 읽는건데 아무것도 없음. 빈문자가 들어가게 됨

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt(); //10\n
            //10 \n 이렇게 이력됨. nextInt는 10만 가져됨. 그러며 ㄴ\n은 ㄴ남아있음
            input.nextLine(); //조치: 엔터 한 번 읽어주고 버리기

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}
