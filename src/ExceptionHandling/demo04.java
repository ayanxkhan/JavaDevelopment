package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class demo04 {
    public static void main(String[] args) {
        int i = 8;
        int j = 1;
        int k = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int j =Integer.parseInt(br.readLine());
//        here we will get a string and to convert into integer we have to pass it int using


        try{
            System.out.println("Enter a number : ");
            j =Integer.parseInt(br.readLine());
            k = i/j;
            System.out.println("Output : " + k);

//            System.out.println("BYE");

//            but if i give some input as abc then it will directly move to catch part and BYE will not print
//            to print BYE either we can print BYE statement in catch part
//            but that would cause redundancy
//            therefore to print anything compulsorily we use finally keyword.


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

        finally {
//            br.close();
            System.out.println(" FINALLY BYE");
        }


    }
}
