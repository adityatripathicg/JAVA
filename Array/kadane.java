public class kadane {
    public static void kadane(int num[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            cs+=num[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println(ms);
    }
    public static void main(String args[]){
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane(num);
    }
}
