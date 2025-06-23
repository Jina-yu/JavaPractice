package cond.ex;

public class ForEx2 {
    public static void main(String[] args) {
        int count = 1;
        for (int num = 2; count <= 10; count++) {
            System.out.println(num);
            num+=2;


        }
    }
}

/*
for (int num = 2, count = 1; count <= 1; num += 2, count++)
 */