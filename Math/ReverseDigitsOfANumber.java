import java.util.*;
public class ReverseDigitsOfANumber {

    public static int reverseDigits(int n){
        int revNum = 0;

        while(n!=0){
            int last = n%10;
            revNum= revNum*10+last;
            n=n/10;
        }
        return revNum;
        // return 5;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Input: "+ n);
        System.out.println(reverseDigits(n));
    }
}
