package Leetcode;

import com.paul.Utilities;

//You are given an n x n 2D matrix representing an image.
//Rotate the image by 90 degrees (clockwise).
//Do not use another 2d array for this
public class RotateArray {
    public static void main(String[] args){

        int multiArray[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

//        int multiArray[][] = {
//                {5, 1, 9,11},
//                { 2, 4, 8,10},
//                {13, 3, 6, 7},
//                {15,14,12,16},
//        };

        int multiArrayResult[][] = fasterRotateArray(multiArray);

        System.out.println("Printing result");
        Utilities.printMultiArray(multiArrayResult);
}

    public static int[][] rotateArray(int array[][]){

        for(int i = 0; i<array.length; i++){
            for(int j = i; j<array[0].length; j++){
                int temp = 0;
                temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        for(int i =0 ; i<array.length; i++){
            for(int j = 0; j<array.length/2; j++){
                int temp = 0;
                temp = array[i][j];
                array[i][j] = array[i][array.length-1-j];
                array[i][array.length-1-j] = temp;
            }
        }
        return array;
    }

    public static int[][] fasterRotateArray(int matrix[][]) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++)
            for (int j = i; j < n - i - 1; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = tmp;
            }
        return matrix;
    }


}
