package Ch1;
import java.util.*;

public class Q6 {
    
    public static void main(String[] args) {
        String word = "aaAAbcccccaaa";
        System.out.println(compressString(word));
    }

    public static String compressString(String s){
        String comp = compress(s);

        if(comp.length() > s.length()){
            return s;
        }
        return comp; 
    }

    public static String compress(String s){
        String comp = "";
        char prev = s.charAt(0);
        int count = 1;

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != prev){
                comp += Character.toString(prev) + count;
                prev = s.charAt(i);
                count = 1;
            }
            else{
                count++;
            }
        }

        comp += Character.toString(prev) + count;
        return comp;
    }

}