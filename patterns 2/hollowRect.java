import java.util.Scanner;

public class hollowRect{
    public static void hollow_Rectangle(int rows,int col){
        for(int i=1;i<=rows;i++){
           for(int j=1;j<=col;j++){
             if(i==1||i == rows||j==1||j==col){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            
           }
           System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        hollow_Rectangle(rows, col);
    }
}