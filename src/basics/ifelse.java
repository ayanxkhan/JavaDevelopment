package basics;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age: ");
        int age = sc.nextInt();

        if(age < 5) {
            System.out.println("You are child,Go to school");
        }
        else if(age > 5 && age <=18){
            System.out.println("Cannot Vote");
        }
        else{
            System.out.println("Can Vote");
        }
    }
}