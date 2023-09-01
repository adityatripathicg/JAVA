import java.util.*;
public class primeno {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==2){
            System.out.println(n + " is a prime number");
        }
        else{
            boolean prime = true;
            for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                prime = false;
            }
        }
        if(prime==true){
            System.out.println(n + " is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number.");
        }
        }

        
    }
}
