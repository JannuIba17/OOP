package DSA.Day13.Stack;

import java.util.NoSuchElementException;

/*

 */
class ListNode{
    int data;
    ListNode next;
    public ListNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class StackDemo {
    private ListNode top;
    private int length;
    public StackDemo(){
        this.top=null;
        this.length=0;
    }
    public int size(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void push(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=top;
        top=newNode;
        length++;
    }
    public int pop(){
        if(isEmpty()){
            throw new NoSuchElementException("Stack is Empty");
        }
        int result=top.data;
        top=top.next;
        length--;
        return result;
    }
    public int peek(){
        if(isEmpty()){
            throw new NoSuchElementException("Stack is Empty");
        }
        return top.data;
    }
    public static void main(String[] args) {
        StackDemo stack=new StackDemo();
        System.out.println(stack.size());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }
}
