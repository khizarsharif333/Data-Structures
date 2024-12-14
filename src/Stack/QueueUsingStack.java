package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class QueueUsingStack {

    private Stack<Integer> a;
    private Stack<Integer> b;

    public QueueUsingStack() {
        a = new Stack<Integer>();
        b = new Stack<Integer>();
    }

    public void push(int x) {
        a.push(x);
    }

    public int pop() {
        if(!b.isEmpty()) {
            return b.pop();
        }
        else {
            while(!a.isEmpty()) b.push(a.pop());
        }
        return b.pop();
    }

    public int peek() {
        if(!b.isEmpty()) {
            return b.peek();
        }
        else {
            while(!a.isEmpty()) b.push(a.pop());
        }
        return b.peek();
    }

    public boolean empty() {
        return a.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStack obj = new QueueUsingStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.pop());
    }

}
