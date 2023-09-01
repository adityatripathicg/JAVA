import java.util.*;
public class sumofdigits {
    public static int sumofdigits(int num){
        int sum =0;
        while(num>0){
            int ld = num%10;
            sum += ld;
            num = num/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sumofdigits = sumofdigits(num);
        System.out.println("The Sum of the digits of "+ num + " is "+ sumofdigits);
    }
}
