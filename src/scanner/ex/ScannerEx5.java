package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요.: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요.: ");
        int num2 = scanner.nextInt();


        // num1이 num2보다 큰 경우, 두 숫자를 교환하세요.
        if(num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;

        }
//        System.out.print("두 숫자 사이의 모든 정수: " + num1 + ", " + num2);
        System.out.print("두 숫자 사이의 모든 정수: " );

        //출력을 해야 해서 for문 사용
        // ex) 5, 7 ( 5~7 사이 정수 출력 )
        for(int i = num1; i <= num2; i++){
            System.out.print(i);

            if(i != num2) { // 마지막 정수에 ',' 제외 시키는 방법
                System.out.print(",");
            }

        }

    }
}
