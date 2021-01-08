package Ch8;

public class Q1 {

    public int findWays(int steps, int [] mem){
        if(steps <= 0){
            return 0;
        }

        if(mem[steps] != 0){
            return mem[steps];
        }

        mem[steps] = findWays(steps - 1, mem) + findWays(steps - 2, mem) + findWays(steps - 3, mem);

        return mem[steps];
    }

    public int staircase(int step){
        int [] mem = new int [step + 1];
        if(step == 0){
            return 0;
        }
        else if(step == 1){
            return 1;
        }
        else if(step == 2){
            return 2;
        }
        else if(step == 3){
            return 4;
        }
        
        mem[0] = 0;
        mem[1] = 1;
        mem[2] = 2;
        mem[3] = 4;

        return findWays(step, mem);

    } 

    public static void main (String [] args){
        Q1 q1 = new Q1();
        System.out.println(q1.staircase(4));
    }
}
