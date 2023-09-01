public class argumentbyrefernce {
    public static void update(int marks[], int a){
        a = 10;
        for(int i = 0; i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
        int marks[]={97,98,99};
        int a = 5;
        update(marks, a);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
