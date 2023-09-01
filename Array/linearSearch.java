public class linearSearch {
    public static int linearSearchs(int num[], int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        // int num[]={2,4,6,8,10,12,14,16};
        // int key = 10;
        // int index = linearSearchs(num, key);
        String munuu[]={"dosa","samosa", "noodles","momos"};
        String key2 = "dosa"; 
        int index = menuu(munuu, key2);
        if(index==-1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("key is at index "+index);
        }
        
    }
    public static int menuu(String munuu[], String key2){
        for(int i=0;i<munuu.length;i++){
            if(munuu[i]==key2){
                return i;
            }
        }
        return -1;
    }
}
