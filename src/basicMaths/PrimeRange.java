package basicMaths;

//import java.util.Scanner;
import java.util.*;
public class PrimeRange {

    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int lower,int upper){
        for(int i=lower;i<=upper;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit:");
        int lower = sc.nextInt();
        System.out.println("Enter upper limit:");
        int upper = sc.nextInt();

        printPrime(lower,upper);
    }
}