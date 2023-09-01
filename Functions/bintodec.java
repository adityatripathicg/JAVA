import java.util.*;
public class bintodec {
    public static void bintodeci(int binnum){
        int num = binnum;
        int dec = 0;
        int pow =0;
        while(binnum>0){
            int ld = binnum%10;
            dec = dec +(ld * (int)Math.pow(2, pow));
            pow++;
            binnum=binnum/10;
        }
        System.out.println("the decimal no of "+ num + " is "+dec);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bintodeci(n);
    }
}
