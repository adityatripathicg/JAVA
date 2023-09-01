import java.util.*;
public class rangeprime {
    public static boolean prime(int n){
        boolean prime = true;
        if(n==2){
            prime=true;
        }
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        return prime;
    }
    public static void range(int n){
        for(int i = 2;i<=n;i++){
            if(prime(i)){
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        range(n);
    }
}
