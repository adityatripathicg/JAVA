public class largestnum {
    public static int getlargest(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
            if(smallest>num[i]){
                smallest=num[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }
    public static void main(String args[]){
        int num[] = {12,20,33,23,45,11};
        int large = getlargest(num);
        System.out.println(large);
    }
}
