package Ch3;

import java.util.EmptyStackException;
import java.util.Stack;

public class Q3 {

    public static class stackOfStacks{

        private MyStack <Stack> sos;
        private int max;
        private int stackCounter;
        private int count;

        public stackOfStacks(int max){
            sos = new MyStack<Stack>();
            stackCounter = -1;
            this.max = max;
            count = 0;
        }

        public void push(int i){
            if(stackCounter == -1 || count >= max){
                Stack<Integer> t = new Stack<Integer>();
                t.push(i);
                sos.push(t);
                count = 0;
                stackCounter++;
            }
            else{
                Stack<Integer> s = sos.peek();
                s.push(i);
                count++;
            }
        }

        public int pop(){
            if(stackCounter == -1){
                throw new EmptyStackException();
            }
            else if (count == 0){
                count = max;
                Stack <Integer> s = sos.peek();
                sos.pop();

                return s.pop();
            }

            Stack <Integer> s = sos.peek();
            count -= 1;
            return s.pop();
        }
    }

    public static void main(String[] args) {
        stackOfStacks sos = new stackOfStacks(2);
        sos.push(3);
        sos.push(2);
        sos.push(1);
        sos.push(0);

        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
    }

    
}