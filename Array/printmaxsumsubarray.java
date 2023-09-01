public class printmaxsumsubarray {
    public static void MaxSumSubArray(int num[]){
        int Max = Integer.MIN_VALUE;
        int Curr =0;
        int prefix[] = new int [num.length];

        prefix[0]=num[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        
        //int Curr = 0; //Tech-1
        for(int i = 0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                Curr = i == 0 ? prefix[i] : prefix[j] - prefix[i-1];


                //Technique-1
                // Curr=0;
                // for(int k =i;k<=j;k++){
                //     Curr+=num[k];
                // }
                // System.out.println(Curr);
                if(Curr>Max){
                    Max=Curr;
                }
            }
        }
        System.out.println("Maximum Sum is : "+Max);

    }
    public static void main(String args[]){
        int num[]={1,-2,6,-1,3};
        MaxSumSubArray(num);
    }
}
