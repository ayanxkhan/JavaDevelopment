package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class demo03 {
    public static void main(String[] args) {
        int i = 8;
        int j = 1;
        int k = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int j =Integer.parseInt(br.readLine());
//        here we will get a string and to convert into integer we have to pass it int using


        try{
            j =Integer.parseInt(br.readLine());
            k = i/j;

        }

        catch (IOException e){
            System.out.println("Some IO error");
        }

        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero " + e);
        }


//        always write this catch block at end because it will handle all exceptions than what other exceptions
//        are doing like above
        catch (Exception e){
            System.out.println("Unknown Exception " + e );
        }


        System.out.println(k);
    }

}
