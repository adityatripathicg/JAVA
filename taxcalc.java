import java.util.*;
public class taxcalc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int tax;
        if(input<500000){
           tax = 0;
        }
        else if(input>=500000 && input<1000000){
            tax = (int) (input * 0.2);
        }
        else {
            tax = (int) (input * 0.3);
        }
        System.out.println("your tax is : " + tax);
    }
}
