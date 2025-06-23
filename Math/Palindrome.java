import java.util.*;
public class Palindrome {
    public static void checkPalindrome(int n){
        int j=n;
        int rev = 0;
        while(n!=0){
            int k = n%10;
            rev=rev*10+k;
            n=n/10;
        }
        if(rev==j){
            System.out.print("palindrome");
        }else System.out.print("not palindrome");
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.print("output: ");
        checkPalindrome(n);

    }
}
