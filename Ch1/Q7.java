package Ch1;
import java.util.*;

public class Q7 {
    
    public static void main(String[] args) {
        int [][] matrix = {
            {91,92,81,82},
            {93,94,83,84},
            {71,72,61,62},
            {73,74,63,64}
        };
        printMatrix(matrix);
        System.out.println("");
        printMatrix(rotateMatrix(matrix));

    }

    public static int [][] rotateMatrix(int [][] matrix){
        int n = matrix[0].length;

        for(int x = 0; x < n/2; x++){
            for(int y = x; y < n - 1 - x; y++){
                int temp = matrix[x][y];

                matrix[x][y] = matrix[y][n-1-x];
                matrix[y][n-1-x] = matrix[n-1-x][n-1-y];
                matrix[n-1-x][n-1-y] = matrix[n-1-y][x];
                matrix[n-1-y][x] = temp;

            }
        }
        return matrix;
    }

    public static void printMatrix(int [][] matrix){
        int n = matrix[0].length;
        for(int x = 0; x < n; x++){
            System.out.println("");
            for(int y = 0; y < n; y++){
                System.out.print(matrix[x][y] + ", ");
            }
        }
    }
}