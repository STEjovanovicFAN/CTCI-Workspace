package Ch1;

import java.util.*;
public class Q9 {
    
    public static void main(String[] args) {
        System.out.println(stringRotation("erbottlewat", "waterbottle"));
    }

    public static boolean stringRotation(String s1, String s2){
        if(s1.length() != s2.length())
            return false;

        return isSubstring(s1+s1, s2);    

    }

    public static boolean isSubstring(String s1, String s2){
        return s1.contains(s2);

    }
}