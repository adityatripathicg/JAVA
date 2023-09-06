public class operationsonith {
    //Get ith Bit
    public static int Getith(int n,int i){
        int bitmask=i<<1;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    //Set ith Bit
    public static int setith(int n,int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    //Clear ith Bit
    public static int clearithbit(int n, int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }
    public static int update(int n,int i,int newbit){
        clearithbit(n, i);
        int bitmask = newbit<<i;
        return n | bitmask;
    }
    //Clear last i Bits
    public static int clearlast(int n,int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(Getith(10,2));
        System.out.println(clearithbit(10,1));
        System.out.println(setith(10,2));
        System.out.println(update(10, 2, 0));
        System.out.println(clearlast(10, 2));
    }
}
