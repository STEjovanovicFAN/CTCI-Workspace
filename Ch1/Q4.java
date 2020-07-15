package Ch1;
import java.util.*;

public class Q4 {
    
    public static void main(String[] args) {
        String phrase = "Tact Coa";
        System.out.println(palPerm(phrase));
    }

    public static boolean palPerm(String s){
        s = s.replace(" ", "");

        HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
        hmap = countLetters(s);

        int countOdd = 0;
        for(char c : hmap.keySet()){
            int value = hmap.get(c);
            if(value % 2 != 0){
                countOdd++;
            }
        }

        if(s.length() %2 == 0){
            if(countOdd > 0){
                return false;
            }
        }

        else{
            if(countOdd > 1){
                return false;
            }
        }

        return true;
    }

    public static HashMap <Character,Integer> countLetters(String s){
        HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();

        for(int i = 0; i < s.length(); i ++ ){
            char key = Character.toLowerCase(s.charAt(i));
            if(!hmap.containsKey(key)) {
                hmap.put(key, 1);
            }
            else{
                hmap.put(key, hmap.get(key) + 1);
            }
        }

        return hmap;
    }

}