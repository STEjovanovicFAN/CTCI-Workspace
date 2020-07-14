package Ch1;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        String url = "Mr John Smith    "; 
        int num = 13;

        System.out.println(urlify(url, num));
    }
    
    public static String urlify(String url, int num){
        char [] cArray = url.toCharArray();

        for(int i = 0; i < cArray.length; i++){
            if(cArray[i] == ' '){
                cArray = shift(cArray, 2, i);
                cArray[i] = '%';
                cArray[i+1] = '2';
                cArray[i+2] = '0';
                i = i + 2; 
            }
        }

        return String.valueOf(cArray);
    }

    public static char [] shift(char [] cArray, int moveAmt, int stop){

        for(int i = 0; i < moveAmt; i ++){
            for(int j = cArray.length-1; j > stop; j --){
                cArray[j] = cArray[j-1];
            }
        }

        return cArray;
    }

}