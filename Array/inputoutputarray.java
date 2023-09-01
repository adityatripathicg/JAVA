import java.util.Scanner;

public class inputoutputarray {
    public static void main(String args[]){
        int marks[] = new int[3];
        Scanner sc = new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("Phy : "+marks[0]);
        System.out.println("Chem : "+marks[1]);
        System.out.println("Bio : "+marks[2]);
        float percentage = (marks[0]+marks[1]+marks[2])*100/300;
        System.out.println("Percentage : " + percentage+"%");
        System.out.println("Total no. of subjects : " + marks.length);//length of array
    }
}
