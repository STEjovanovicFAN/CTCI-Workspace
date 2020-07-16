package Ch1;
import java.util.*;

public class Q5 {
    
    public static void main(String[] args) {
        System.out.println(oneAway("pale", "ple"));
        System.out.println(oneAway("pales", "pale"));
        System.out.println(oneAway("pale", "bale"));
        System.out.println(oneAway("pale", "bake"));
    }

    public static boolean oneAway(String s1, String s2){
        if(s1.equals(s2)){
            return true;
        }

        if(s1.length() != s2.length()){
            if(s1.length() < s2.length()){
                s1 = insert(s1, s2);
            }
            else{
                s2 = insert(s2, s1);
            }
        }
        else{
            s1 = replace(s1, s2);
        }

        if(!s1.equals(s2)){
            return false;
        }

        return true;
    }

    public static String insert(String s1, String s2){
        String ins = s1;

        for(int i = 0; i < s2.length(); i++){
            if(i == s2.length()-1){
                ins += s2.charAt(i);
                break;
            }

            if(s1.charAt(i) != s2.charAt(i)){
                String sub = s1.substring(0,i);
                String rem = s1.substring(i);
                ins = sub + s2.charAt(i) + rem;
                break;
            }

        }

        return ins;
    }

    public static String replace(String s1, String s2){

        String rec = "";
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                String rem = s1.substring(i+1);
                rec += s2.charAt(i) + rem;
                break;
            }
            rec += s1.charAt(i);
        }
        return rec;
    }

}