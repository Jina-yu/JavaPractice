package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        //private 인스턴스 생성을 막는다.
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int min = values[0];
        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int value : values) {
            if (value >= 0) {
                max = value;
            }
        }
        return max;
    }
}
