package method.ex;

import java.util.Scanner;

public class MethodEx4_sol {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);
        int select = 0;

        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("---------------------------------------");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            int amount;

            switch (choice) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.print("출금액을 입력ㅎ세요: ");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);
                case 3:
                    System.out.println("현재 잔액: " + balance + "원");
                    break; //스위치문 빠져나감
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return; //완전 종료, 메소드 리턴은 아예 나가버림. while이고 스위치고 메인메서드가 종료됨. while문으로 빠져나가서 return으로 해야함
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
            }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return balance;
    }
}
