package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class demo06 {
//    here we have supressed the exceptions using throws keyword.
    public static void main(String[] args) throws Exception {
        int i = 8;
        int j = 1;
        int k = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



            System.out.println("Enter a number : ");
            j = Integer.parseInt(br.readLine());
            k = i / j;
            System.out.println("Output : " + k);

//


    }
}
