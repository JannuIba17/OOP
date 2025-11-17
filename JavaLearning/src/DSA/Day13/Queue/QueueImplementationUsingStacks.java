package DSA.Day13.Queue;

import java.util.Stack;

public class QueueImplementationUsingStacks {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public QueueImplementationUsingStacks(){
        stack1=new Stack<>();
        stack2=new Stack<>();
    }
    public void enqueue(int value){
        stack1.push(value);
    }
    public int dequeue(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    public int top(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public static void main(String[] args) {
        QueueImplementationUsingStacks queue=new QueueImplementationUsingStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue());
    }

}
