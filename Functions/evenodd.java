import java.util.*;
public class evenodd {
    public static boolean evenodd(int n){
        boolean even = false;
        if(n%2==0){
            even = true;
        }
        return even;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean even = evenodd(n);
        System.out.println(even);


    }
}
