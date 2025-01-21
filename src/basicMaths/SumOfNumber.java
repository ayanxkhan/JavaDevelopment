package basicMaths;

public class SumOfNumber {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        while(num!=0){
            int last = num % 10;
            sum = sum + last;
            num = num / 10;
        }
        System.out.println(sum);
    }
}