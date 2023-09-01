import java.util.*;
public class sumofn {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        //While Loop
        // int count = 1;
        // while(count<=range){
        //     sum = sum+count;
        //     count++;
        // }
        //For loop
         int sum = 0;
        for(int count = 1; count<=range;count++){
            sum += count;
        }
        System.out.println(sum);
    }
}
