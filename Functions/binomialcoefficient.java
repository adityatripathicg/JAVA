import java.util.*;
public class binomialcoefficient {
    public static int n(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static int r(int r){
        int fact = 1;
        for(int i=1;i<=r;i++){
            fact = fact*i;
        }
        return fact;
        
    }
    public static int k(int k){
        int fact = 1;
        for(int i=1;i<=k;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static int bc(int nf,int rf,int kf){
        int pro = rf*kf;
        int bc = nf/pro;
        return bc;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        System.out.println("Enter the value of R");
        int r = sc.nextInt();
        int k = n-r;
        int nf = n(n);
        int rf = r(r);
        int kf = k(k);
        int bc= bc(nf, rf, kf);
        System.out.println(bc);

    }
}
