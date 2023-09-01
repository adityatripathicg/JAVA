import java.util.Scanner;

public class avgof3 {
    public static int avg3(int a,int b,int c){
        return (a+b+c)/3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = avg3(a, b, c);
        System.out.println("The avg of is " + avg);
    }
}
