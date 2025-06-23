package cond.ex;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자는: " + i);
            i++;
        } while (i < 3); //참이면 다시실행, 거짓이면 while문 빠져나감. 앞에 한 번 하고 조건ㄴ문 검사
    }

}


