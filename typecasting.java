import java.util.*;
public class typecasting {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a = 55.1211122333;
        char s = 'a';
        char t = 'b';
        int number = s;
        int number2 = (int) t;

        int b = (int) a;
        System.out.println(b);
        System.out.println(number);
        System.out.println(number2);
    }
}
