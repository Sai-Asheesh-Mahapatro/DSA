import java.util.*;
public class Gcd {

    public static int gcd1(int n1, int n2){
        int gcd = 0;
        for(int i=1; i<=Math.min(n1, n2); i++){
            
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static int gcd2(int n1, int n2){
        while(n1>0 && n2>0){
            if(n1>n2){
                n1=n1%n2;
            }else n2=n2%n1;
        }
        if(n1==0)return (n2);
        return (n1);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        // gcd1(n1, n2);
        System.out.println("output: " +gcd1(n1, n2));
    }
}
