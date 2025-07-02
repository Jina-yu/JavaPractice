package lang.String.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        int index = str.indexOf(".txt");
        String filename = str.substring(0, index);
        String extNAme = str.substring(index);
        System.out.println("filename = " + filename);
        System.out.println("extName = " + extNAme);
    }
}
