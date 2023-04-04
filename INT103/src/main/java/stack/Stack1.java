package stack;

import java.util.Stack;

public class Stack1 {

    public static void main(String[] args) {
        // create a stack
        Stack<String> st1 = new Stack<>();
        // like add() method in ArrayList
        st1.push("ONE");
        st1.push("TWO");
        st1.push("THREE");
        st1.push("FOUR");
        st1.push("FIVE");
        // print stack
        System.out.println(st1);
        // return the last element that we push in the stack
        System.out.println(st1.peek());
        System.out.println(st1);
        // remove the last element that we push in the stack
        System.out.println(st1.pop());
        System.out.println(st1);
        // remove the element that match in stack | return boolean, true if it matches and false otherwise
        System.out.println(st1.remove("ONE"));
        System.out.println(st1.remove("FUCK"));
        System.out.println(st1);
        // return the 1-based position | the 1-based position like an index but it's starts from 1 and order backwards
        System.out.println(st1.search("THREE"));
        // if it doesn't match in the stack, this method will return -1
        System.out.println(st1.search("FUCK"));
        // return the element by index
        System.out.println(st1.get(1));
        // return boolean, true if it matches in the stack and false otherwise
        System.out.println(st1.contains("TWO"));
        System.out.println(st1.contains("FUCK"));
        // return boolean, true if stack is empty and false otherwise
        System.out.println(st1.empty());
        System.out.println(st1);
    }
}
