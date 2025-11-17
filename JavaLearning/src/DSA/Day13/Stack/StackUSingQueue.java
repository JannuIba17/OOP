package DSA.Day13.Stack;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackUSingQueue {
    Queue<Integer> queue;
    int length;
    public StackUSingQueue(){
        queue=new LinkedList<>();
        length=0;
    }
    public void push(int value){
        queue.add(value);
        int size=queue.size()-1;
        for(int i=0;i<size;i++){
            queue.add(queue.poll());
        }
        length++;
    }
    public int pop(){
        if(queue.isEmpty()){
            throw new NoSuchElementException("Stack is Emptyu");
        }
        return queue.poll();
    }
    public int peek(){
        if(queue.isEmpty()){
            throw new NoSuchElementException("Stack is Emptyu");
        }
        return queue.peek();
    }
    public static void main(String[] args) {
        StackUSingQueue stack=new StackUSingQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
    }
}
