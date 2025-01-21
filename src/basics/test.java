package basics;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
//        System.out.println(age);

        if (age<18){
            System.out.println("Cannot Vote");
        }
        else{
            System.out.println("Can vote");
        }

    }
}