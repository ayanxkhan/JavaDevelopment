//package basicMaths;
//
//import java.util.Scanner;
//
//public class fibonacci {
//
//    public static int fib(int num){
//        if (num == 0) {
//            return 0; // Base case for 0
//        } else if (num == 1) {
//            return 1; // Base case for 1
//        }
//        return fib(num - 1) + fib(num - 2); // Recursive case
//    }
//    public static void main(String[] args) {
//        System.out.print("Enter a number: ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println("The " + num + "th Fibonacci number is: " + fib(num));
//    }
//}


package basicMaths;

public class fibonacci {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        int fib = 0;

        for(int i=0;i<10;i++){
            fib = a + b;
            System.out.println(fib);
            a = b;
            b = fib;
        }
    }
}