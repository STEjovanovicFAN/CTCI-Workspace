package Ch3;
import java.util.*;

public class Q2 {

    public static class stackWithMin extends MyStack<Integer>{
        Stack<Integer> min;

        public stackWithMin(){
            min = new Stack<Integer>();
        }

        public int min(){
            if(min.isEmpty()){
                return Integer.MAX_VALUE;
            }

            return min.peek();
        }

        public void push(int i){
            if(i <= min()){
                min.push(i);
            }
            super.push(i);
        }

        public Integer pop(){
            int i = (int) super.pop();
            if(i == min()){
                min.pop();
            }

            return i;
        }

        
    }

    public static void main(String[] args) {
        stackWithMin stack = new stackWithMin();
        stack.push(3);
        System.out.println(stack.min());
        stack.push(1);
        System.out.println(stack.min());
        stack.push(7);
        System.out.println(stack.min());
        stack.pop();
        stack.pop();
        System.out.println(stack.min());
    }

}