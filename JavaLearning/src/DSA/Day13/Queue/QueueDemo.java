package DSA.Day13.Queue;

import java.util.NoSuchElementException;

class ListNode{
    int data;
    ListNode next;
    public ListNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class QueueDemo {
    private ListNode front;
    private ListNode rear;
    private int length;
    public QueueDemo(){
        this.front=null;
        this.rear=null;
        this.length=0;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public int size(){
        return length;
    }
    public void enqueue(int value){
        ListNode newNode=new ListNode(value);
        if(front==null){
            front=newNode;
        }else{
            rear.next=newNode;
        }
        rear=newNode;
        length++;
    }
    public int dequeue(){
        if(isEmpty()){
           throw new NoSuchElementException("Queue is Empty");
        }
        int result=front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        length--;
        return result;
    }
    public int first(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is Empty");
        }
        return front.data;
    }
    public int last(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is Empty");
        }
        return rear.data;
    }
    public static void main(String[] args) {
        QueueDemo queue=new QueueDemo();
        queue.enqueue(10);
        queue.enqueue(45);
        queue.enqueue(89);
        System.out.println(queue.dequeue());
        System.out.println(queue.first());
        System.out.println(queue.last());
    }
}
