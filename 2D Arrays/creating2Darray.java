import java.util.*;
public class creating2Darray{
    public static void row2(int matrix[][]){
         //To Print only row 2
         for(int j = 0;j<matrix.length;j++){
            System.out.print(matrix[1][j]+" ");
            }
        System.out.println();
    }
    public static void col3(int matrix[][]){
        //To Print Coloumn 3
        for(int i = 0;i<matrix.length;i++){
            System.out.println(matrix[i][2]+" ");
        }
    }
    public static boolean search(int matrix[][]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Key ?"); 
        int key = sc.nextInt();
        for(int i=0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Yes, the key "+ key + " is present at ("+i+","+j+")");
                    return true;
                }
            //System.out.println();
            }
    }
    System.out.println("No, The Key is not present");
    return false;
}
//Prints the Smallest value of 2D array
public static void smallest(int matrix[][]){
    int smallest = Integer.MAX_VALUE;
    for(int i = 0;i<matrix.length;i++){
        for(int j = 0;j<matrix[0].length;j++){
            smallest = Math.min(smallest, matrix[i][j]);
        }
    }
    System.out.println("The Smallest Element in Array is : "+smallest);
}
//Prints the largest value of 2D array
    public static void largest(int matrix[][]){
    int largest = Integer.MIN_VALUE;
    for(int i = 0;i<matrix.length;i++){
        for(int j = 0;j<matrix[0].length;j++){
            largest = Math.max(largest, matrix[i][j]);
        }
    }
    System.out.println("The Largest Element in Array is : "+largest);
}
    public static void main (String args[]){
        //Creation
        int matrix[][] = new int [3][3];
        //int key = 3;
        //Input
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j = 0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //Output
        for(int i=0;i<matrix.length;i++){
            for(int j = 0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
       
        //for(int i=0;i<matrix.length;i++){
            
       // }
        search(matrix);
        smallest(matrix);
        largest(matrix);
        row2(matrix);
        col3(matrix);
    }

}