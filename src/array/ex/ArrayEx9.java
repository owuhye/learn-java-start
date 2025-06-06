package array.ex;

import java.util.Scanner;

public class ArrayEx9 {

    public static void main(String[] args) {
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 상품등록 | 2. 상품목록 | 3.종료\n메뉴를 선택하세요.:");
            int menu = scanner.nextInt();
            scanner.nextLine();

            String product = scanner.nextLine();

            if (menu == 1){

                System.out.println("상품 이름을 입력하세요. :");
                productNames[productCount] = scanner.nextLine();

                System.out.println("상품 가격을 입력하세요. :");
                productPrices[productCount] = scanner.nextInt();

                productCount++;
            } else if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원 ");
                }
            } else if ( menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택했습니다.");
            }

        }
    }
}
