public class trappedrainwater{
    public static int trapped_rainwater(int height[]){
        //create left boundary - array
        int leftmax[] = new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]= Math.max(height[i], leftmax[i-1]);
        }
        int n = height.length;
        //create right boundary - array
        int rightmax[] = new int[height.length];
        rightmax[rightmax.length-1]=height[height.length-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]= Math.max(height[i], rightmax[i+1]);
        }

        //loop to calc watel level
       // int waterlevel[] = new int[n];
       int trapped =0;
        for(int i=0;i<n;i++){
            //waterlevel[i] = Math.min(leftmax[i], rightmax[i]);
           int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapped += waterlevel-height[i];
        }
        // final trapped water calculation 
        // int sum=0;
        // int trapped[] = new int[n];
        // for(int i=0;i<n;i++){
        //     trapped[i] = waterlevel[i]-height[i];
        //     sum+=trapped[i];
        // }
        // return sum;
        return trapped;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        int sum = trapped_rainwater(height);
        System.out.println(sum);
    }
}