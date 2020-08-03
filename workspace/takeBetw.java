package workspace;

import java.util.*;
import java.lang.*;
import java.io.*;

class takeBetw
{
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        
        String input = console.readLine();
		String leftSep = console.readLine();
		String rightSep = console.readLine();
		Boolean takeUntilEndIfRightMissing = (console.readLine().equals("1")) ? true : false;
		String output = TakeBetween(input, leftSep, rightSep, takeUntilEndIfRightMissing);
		System.out.println(output);
	}
	
	public static String TakeBetween(String input, String left, String right, Boolean takeUntilEndIfRightMissing) throws Exception
	{
        if(left.equals("") || right.equals("")){
            throw new Exception("Error right or left input is empty.");
        }
        
        if(input.equals("")){
            return input;
        }

        int leftIndex = input.indexOf(left);
        int rightIndex = input.indexOf(right);

        if(left.equals(right)){
            rightIndex = input.lastIndexOf(right);
        }

        if(leftIndex > rightIndex){
            rightIndex = -1;
        }

        if(leftIndex == -1 && rightIndex == -1)
            return null;
        
        else if(leftIndex == -1)
            return null;
        
        else if(rightIndex == -1 && takeUntilEndIfRightMissing == false)
            return null;
    
        else if(rightIndex == -1 && takeUntilEndIfRightMissing == true)
            return input.substring(leftIndex + left.length());

	    return input.substring(leftIndex + left.length(), rightIndex);
	}

}