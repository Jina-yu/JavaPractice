package lang.String.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        System.out.println("filename = " + str.substring(0,4));
        System.out.println("extname = " + str.substring(5,9));
    }
}
