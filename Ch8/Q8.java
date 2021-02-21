package Ch8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Q8 {

    public boolean doSwap(char [] carr, int index, int i){
        for(int j = index; j < i; j++){
            if(carr[j] == carr[i]){
                return false;
            }
        }
        return true;
    }

    public void perms(char[] carr, int index, List<String> str, HashSet<String> mem){
        if(index >= carr.length){
            
            if(!str.contains(String.valueOf(carr))){
                System.out.println(String.valueOf(carr));
                str.add(String.valueOf(carr));
            }
            return;
        }
        
        for(int i = 0; i < carr.length; i++){

            swap(carr, i, index);
            perms(carr, index + 1, str, mem);
            swap(carr, i, index);    

        }
    }

    public void swap(char[] carr, int pointer1, int pointer2){
        char temp = carr[pointer1];
        carr[pointer1] = carr[pointer2];
        carr[pointer2] = temp;
    }


    public void printList(List<String> lst){
        for(int i = 0; i < lst.size(); i++){
            System.out.println(lst.get(i));
        }
    }

    public static void main(String [] args){
        Q8 q = new Q8();
        List<String> lst = new ArrayList<String>();
        HashSet<String> mem = new HashSet<String>();
        String word = "ABC";
        q.perms(word.toCharArray(), 0, lst, mem);

        //q.printList(lst);

    }
    
}
