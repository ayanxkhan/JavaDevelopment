package basicMaths;

import java.util.Scanner;

public class PalindromeRange {

    public static boolean checkPalindrome(int num){
        int temp = num;
        int rev = 0;

        while(num!=0){
            rev = (rev * 10) + num %10;
            num = num / 10;
        }

        if(temp == rev) return true;
        return false;

    }

    public static void printPalindrome(int upper,int lower){
        for(int i=upper;i<=lower;i++){
            if(checkPalindrome(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter upper limit:");
        int upper = sc.nextInt();
        System.out.print("Enter lower limit:");
        int lower = sc.nextInt();

        printPalindrome(upper,lower);
    }
}