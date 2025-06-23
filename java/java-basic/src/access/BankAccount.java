package access;

public class BankAccount {
    private int balance; //잔고

    public BankAccount() {
         balance = 0;
    } //사실 없어도 되는데 public 보여주려고 만든 코드

    //public 메서드: deposit 입금 기능
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
        //입금 금액이 이상하게 들어올 수 있어서 검증 로직 넣기

    }

    //public 메서드: withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    //public 메서드: getBalance
    public int getBalance() {
        return balance;
    }

    //내부에서만 쓸 수 있는 거라 private로 막음
    private boolean isAmountValid(int amount) {
        //금액이 0보다 커야함
        return amount > 0;
    }
}
