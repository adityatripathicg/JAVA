import java.util.*;
public class palindrome {
    //rev of num
    public static int palindrome(int num){
        int rev = 0;
        while(num>0){
            int ld = num%10;
            rev = rev*10+ld;
            num = num/10;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = palindrome(num);
        if(num==rev){
            System.out.println("The number "+ num + " is a palindrome "+ rev );
        }
        else{
            System.out.println("The Number is not a Palindrome");
        }
    }

}
