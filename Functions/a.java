import java.util.Scanner;

public class a {
    public static int isPalindrome(int e){
        int reverse=0;
        while(e>0){
            int rem= e%10;
            reverse= reverse*10 + rem;
            e= e/10;
       }
      return reverse;
   }
    public static void main(String args []){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int e= sc.nextInt();
         int f= e;
          
       int ans= isPalindrome(e);
       System.out.println(ans);
       if(e == reverse){
           System.out.println("palindrome");
       }
       else{
           System.out.println("not palindrome");
       }
         
}
}