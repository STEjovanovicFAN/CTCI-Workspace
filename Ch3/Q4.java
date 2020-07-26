package Ch3;

import java.util.Stack;

public class Q4 {


    public static class stackQueue{

        private Stack<Integer> stack1;
        private Stack<Integer> stack2;
        public stackQueue(){
            stack1 = new Stack<Integer>();
            stack2 = new Stack<Integer>();

        }

        public void add(int i){
            stack1.push(i);
        }

        public int remove(){
            transfer(stack1, stack2);

            int ret = stack2.pop();

            transfer(stack2, stack1);

            return ret;
        }

        //transfer contents from s1 to s2
        private void transfer(Stack<Integer> s1, Stack<Integer> s2){

            while(!s1.empty()){
                s2.push(s1.pop());
            }
        }

    }

    public static void main(String [] args){
        stackQueue sq = new stackQueue();

        sq.add(1);
        sq.add(2);
        sq.add(3);

        System.out.println(sq.remove());
        System.out.println(sq.remove());
        System.out.println(sq.remove());
    }
    
}