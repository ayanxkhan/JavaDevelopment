package basicMaths;

import java.util.Scanner;

public class Palindrome {

    public static void palindrome(int num){
        int temp = num;
        int rev = 0;

        while(num!=0){
            rev = (rev * 10) + num % 10;
            num = num / 10;
        }

        if(temp == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        palindrome(num);
    }
}