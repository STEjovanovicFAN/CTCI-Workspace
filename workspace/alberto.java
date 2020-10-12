package workspace;

import java.util.*;

public class alberto {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        String srev = "";

        for(int i = s.length()-1 ; i >= 0; i--){
            srev += s.charAt(i);
        }

        System.out.println("Reverse is: "  + srev);

    }

}
