import java.util.*;
public class billwithgst {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float erasor = sc.nextFloat();
        float pen = sc.nextFloat();
        float cost = (pen+pencil+erasor);
        float costgst = cost + (cost * 0.18f);
        System.out.println(cost);
        System.out.println(costgst);
        int $ = 24;
        System.out.println($);
        
    }
    
}
