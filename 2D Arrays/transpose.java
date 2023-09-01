public class transpose {
    public static void tp(int matrix[][], int transpose[][]){
        //transposing
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        //print after transpose
        for(int i = 0;i<transpose.length;i++){
            for(int j = 0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int matrix[][] = {{2,3,7},
                        {5,6,7}};
        int transpose[][] = new int[3][2];
        tp(matrix, transpose);             
    }
}
