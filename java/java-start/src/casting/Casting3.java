package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483649L; //int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형ㅂㄴ환
        System.out.println("maxIntValue = " + maxIntValue);

        intValue = (int) 214748368L; //형변환
        System.out.println("maxIntOver casting = " + intValue);
    }
}
