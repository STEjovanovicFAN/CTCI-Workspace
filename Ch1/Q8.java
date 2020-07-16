package Ch1;

import java.util.*;
public class Q8 {
    
    public static void main(String[] args) {
        int [][] matrix = {
            {1,0,1,1},
            {1,1,1,1},
        };
        printMatrix(matrix);
        System.out.println();
        printMatrix(zeroOut(matrix));
    }

    public static int [][] zeroOut(int [][] matrix){
        int [][] modMatrix = new int [matrix.length][];

        for(int i = 0; i < matrix.length; i++){
            modMatrix[i] = Arrays.copyOf(matrix[i], matrix[i].length);
        }

        for(int x = 0; x < matrix.length; x++){
            for(int y = 0; y < matrix[x].length; y++){
                if(matrix[x][y] == 0){
                    modMatrix = blackOut(x, y, modMatrix);
                }
            }
        }
        return modMatrix;
    }

    public static int [][] blackOut(int x, int y, int [][] matrix){
        for(int row = 0; row < matrix.length; row++){
            matrix[row][y] = 0;
        }
        
        for(int col = 0; col < matrix[x].length; col++){
            matrix[x][col] = 0;
        }

        return matrix;
    }

    public static void printMatrix(int [][] matrix){

        for(int x = 0; x < matrix.length; x++){
            System.out.println("");
            for(int y = 0; y < matrix[x].length; y++){
                System.out.print(matrix[x][y] + ", ");
            }
        }
    }
}