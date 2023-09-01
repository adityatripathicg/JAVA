import java.util.*;
public class inputtill10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = 0;
        do{
            input = sc.nextInt();
            if(input%10==0){
                break;
            }
            System.out.println(input);
        }while(true);
    }
}
