package Ch3;

import java.util.Stack;

public class Q5 {
    
    public static Stack<Integer> sortStack(Stack<Integer> s) {
        Stack<Integer> s2 = new Stack<Integer>();

        while (!s.isEmpty()) {
            int lowest = removeLowest(s);
            s2.push(lowest);
        }

        while (!s2.isEmpty()) {
            s.push(s2.pop());
        }

        return s;
    }

    private static int removeLowest(Stack<Integer> s) {
        int lowest = Integer.MAX_VALUE;
        Stack<Integer> s2 = new Stack<Integer>();

        while (!s.isEmpty()) {
            if (s.peek() < lowest) {
                if (lowest != Integer.MAX_VALUE) {
                    s2.push(lowest);
                }
                lowest = s.pop();
            } else {
                s2.push(s.pop());
            }
        }

        while (!s2.isEmpty()) {
            s.push(s2.pop());
        }
        return lowest;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();

        s.add(7);
        s.add(7);
        s.add(1);
        s.add(10);

        s = sortStack(s);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }

}