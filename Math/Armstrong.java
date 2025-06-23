import java.util.*;
public class Armstrong {
    public static String isArmstrong(int n){
        int p=n;
        int len = String.valueOf(n).length();
        int sum=0;
        while(n!=0){
            int k = n%10;
            sum+=Math.pow(k,len);
            n=n/10;
        }
        if(sum==p)return "Armstrong";
        return "not armstrong";
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(isArmstrong(n));
    }
}
