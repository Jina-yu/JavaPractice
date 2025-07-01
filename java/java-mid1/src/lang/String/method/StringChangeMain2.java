package lang.String.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSapces = "    Java Programming";
        System.out.println("소문자로 변환: " + strWithSapces.toLowerCase());
        System.out.println("대문자로 변환: " + strWithSapces.toUpperCase());

        System.out.println("공백 제거(trim): '" + strWithSapces.trim() + "'");
        System.out.println("공백 제거(strip): '" + strWithSapces.strip() + "'");
        System.out.println("앞 공백 제거(strip): " + strWithSapces.stripLeading() + "'");
        System.out.println("뒤 공백 제거(strip): " + strWithSapces.stripTrailing() + "'");
    }
}
