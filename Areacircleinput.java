import java.util.*;

public class Areacircleinput {
    public static void main(String args[]){
        System.out.println("Enter Radius");
        Scanner sc = new Scanner(System.in);
        Float r = sc.nextFloat();
        Float area = 3.14f * r * r;
        System.out.println(area);
    }
}