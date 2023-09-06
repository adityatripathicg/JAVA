public class oddeven {
    public static void oe(int n){
        int bitmask = 1;
        if((n & bitmask) == 1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
    public static void main(String args[]){
        int n = 6;
        oe(n);
    }
}
