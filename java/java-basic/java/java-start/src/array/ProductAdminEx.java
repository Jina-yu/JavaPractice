package array;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        int maxProducts = 10;
        int select = 0;
        Scanner scanner = new Scanner(System.in);
        int[] productPrices = new int[maxProducts];
        String[] productNames = new String[maxProducts];
        int productCount = 0;
        int count = 0;
        int i = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            select = scanner.nextInt();
            scanner.nextLine();

            if (select == 1) {
                System.out.print("상품 이름을 입력하세요: ");
                productNames[i] = scanner.nextLine();
                System.out.print("상품 가격을 입력하세요: ");
                productPrices[i] = scanner.nextInt();
                i++;
                count++;
                if (count > maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                }
            } else if (select == 2) {
                if (count == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                } else {
                    for (int j = 0; j < i; j++) {
                        System.out.println(productNames[j] + ": " + productPrices[j]);
                    }
                }



            } else if (select == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }

    }
}
