import java.util.*;
public class primecheck {
    public static void prime(int n){
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                System.out.println(n + " is Not a Prime Number");
                break;
            }
            else{
                System.out.println(n + " is a Prime Number");
                break;
                
            }
        }
    }
    
  
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime(n);
    }
    
}