package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);
        int select = 0;

        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("---------------------------------------");
            System.out.print("선택: ");
            select = scanner.nextInt();

            int amount;
            if (select == 1) {
                amount = 0;
                System.out.print("입금액을 입력하세요: ");
                amount = scanner.nextInt();
                balance = deposit(balance, amount);

            } else if (select == 2) {
                System.out.print("출금액을 입력하세요: ");
                amount = scanner.nextInt();
                balance = withdraw(balance, amount);
            } else if (select == 3) {
                System.out.println("현재 잔액: " + balance);
            } else if (select == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            }

        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("밸런스"+balance);
            System.out.println(amount + "원을 출금해습니다. 현재 잔액: " + balance);
        } else {
            System.out.println(amount+"원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return balance;
    }

}
