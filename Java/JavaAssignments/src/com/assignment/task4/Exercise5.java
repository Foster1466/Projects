package com.assignment.task4;

public class Exercise5 {
    public static void main(String[] args) {
        int [][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] mat2 = {{9,8,7},{6,5,4},{3,2,1}};
        int [][] sum = new int[3][3];

        int rows = mat1.length, cols=mat1[0].length;

        for (int i=0; i<rows; i++){
            for (int j=0;j<cols; j++){
                sum[i][j]=mat1[i][j]+mat2[i][j];
            }
        }

        for (int[] row:sum){
            for (int e:row){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}
