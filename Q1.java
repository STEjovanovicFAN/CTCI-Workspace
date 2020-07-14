import java.util.*;
public class Q1 {

    public static void main(String[] args) {
        String word = "yes";

        System.out.println("Unique1: " + unique1(word));
        System.out.println("Unique2: " + unique2(word));

    }

    public static boolean unique1(String s){
        HashSet<Character> hs = new HashSet<Character>();
        
        for(int i = 0; i < s.length(); i ++){
            if(hs.contains(s.charAt(i))){
                return false;
            }
            hs.add(s.charAt(i));
        }
        
        return true;
    }

    public static boolean unique2(String s){

        for(int i = 0; i < s.length()-1; i++){
            for(int j = i +1; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }
        }

        return true;
    }

}