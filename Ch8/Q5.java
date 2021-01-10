package Ch8;

public class Q5 {

    public int multi(int a, int b){
        if(a == 0 || b == 0){
            return 0;
        }

        boolean neg = (a < 0 ^ b < 0);

        int sum = multiFunc(Math.abs(a), Math.abs(b), 0);

        if(neg){
            return -sum;
        }
        return sum;

    }

    public int multiFunc(int a, int b, int sum){
        if(b <= 0){
            return sum;
        }

        return(multiFunc(a, b-1, sum + a));

    }


    public static void main(String [] args){
        Q5 q5 = new Q5();

        System.out.println(q5.multi(23, 70));

    }
}
