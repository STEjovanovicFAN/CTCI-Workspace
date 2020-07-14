package Ch1;

import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        String word1 = "dsad";
        String word2 = "dssa";

        System.out.println(permutation(word1, word2));
    }

    public static boolean permutation(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        if(!sortWord(s1).equals(sortWord(s2))){
            return false;
        }

        return true;
    }

    public static String sortWord(String word){
        String [] wordArr = word.split("");
        Arrays.sort(wordArr);
        return Arrays.toString(wordArr);
        
    }

}