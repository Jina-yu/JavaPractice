package method.ex;

public class MethodEx1Ref {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        average(a, b, c);

        int x = 15;
        int y = 5;
        int z = 35;

        average(x, y, z);
    }

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("평균값: " + average);
        return a + b + c;
    }
}
