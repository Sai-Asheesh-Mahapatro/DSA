import java.util.*;
class CountDigitsInANumber{

    public static int countDigits(int n){
        int count = 0;;
        while(n!=0){
            n = n/10;
            count++;

        }  
        return count;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("input is:"+ n);
        System.out.println(countDigits(n));
    }
}