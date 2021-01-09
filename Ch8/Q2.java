package Ch8;

import java.util.HashSet;

public class Q2 {
   
    public boolean startPath(int [][] maze){
        if(maze.length == 0 || maze[0].length == 0){
            return false;
        }
        int rowSize = maze.length;
        int colSize = maze[0].length;

        HashSet<String> mem = new HashSet<String>();

        return findPath(maze, 0, 0, rowSize, colSize,mem);
    }

    public boolean findPath(int [][] maze, int currRow, int currCol, int rowSize, int colSize, HashSet<String> mem){
        if(currRow == rowSize - 1 && currCol == colSize - 1){
            return true;
        }
        boolean pathDown = false;
        boolean pathRight = false;

        if(mem.contains(currRow + " " + currCol)){
            return false;
        }

        if(currRow + 1 < rowSize && maze[currRow + 1][currCol] != -1){
            pathDown = findPath(maze, currRow + 1, currCol, rowSize, colSize, mem);

            if(!pathDown){
                mem.add((currRow + 1) + " " + currCol);
            }
        }

        if(currCol + 1 < colSize && maze[currRow][currCol + 1] != -1){
            pathRight = findPath(maze, currRow, currCol + 1, rowSize, colSize, mem);

            if(!pathRight){
                mem.add(currRow + " " + (currCol + 1));
            }

        }
        
        return pathDown || pathRight;
    }


    public static void main(String [] args){
        Q2 q2 = new Q2();

        int [][] maze = new int [4][4];
        //maze[3][2] = -1;
        maze[2][3] = -1;
        System.out.println(q2.startPath(maze));
    }    

}
