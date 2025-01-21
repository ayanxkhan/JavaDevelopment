package basicMaths;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;

        int ans = 0;
        int lastDigit;

        while(num!=0){
            lastDigit = num % 10;
            ans = ans + (lastDigit*lastDigit*lastDigit);
            num = num / 10;
        }
        if(temp == ans){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not");
        }
    }
}