package basicMaths;

import java.util.Scanner;

public class reverseNumber {

    public static void reverseNum(int num){
        int lastDigit;
        int rev = 0;

        while(num!=0){
            lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num = num / 10;
        }
        System.out.printf("Reversed Number = %d", rev);
    }
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        reverseNum(num);

    }
}