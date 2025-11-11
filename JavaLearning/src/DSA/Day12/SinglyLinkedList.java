package DSA.Day12;
class ListNode{
    int data;
    ListNode next;
    public ListNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class SinglyLinkedList {
    private ListNode head;

    public static void main(String[] args) {
       SinglyLinkedList sll=new SinglyLinkedList();
       sll.head=new ListNode(10);
       ListNode second=new ListNode(20);
       ListNode third=new ListNode(30);
       ListNode fourth=new ListNode(40);
       sll.head.next=second;
       second.next=third;
       third.next=fourth;
       sll.display();
       sll.size();
       sll.insertFirst(5);
       sll.display();
       sll.insertLast(75);
       sll.display();
       sll.insert(4,100);
       sll.display();
       System.out.println(sll.deleteFirst().data);
       sll.display();
        System.out.println(sll.deleteLast().data);
        sll.display();
    }
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void size(){
        ListNode current=head;
        int count=0;
        while(current!=null){
            count++;//4
            current=current.next;
        }
        System.out.println(count);
    }
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void insertLast(int value){
        ListNode newNode=new ListNode(value);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    public void insert(int position,int value){
        ListNode newNode=new ListNode(value);
        if(position==1){
            newNode.next=head;
            head=newNode;
            return;
        }else{
            ListNode previous=head;
            int count=1;
            while(count<position-1){
                previous=previous.next;
                count++;//3
            }
            ListNode current=previous.next;
            previous.next=newNode;
            newNode.next=current;
        }
    }
    public ListNode deleteFirst(){
        if(head==null){
            return null;
        }
        ListNode current=head;
        head=head.next;
        current.next=null;
        return current;
    }
    public ListNode deleteLast(){
        if(head==null) return null;
        ListNode current=head;
        ListNode previous=null;
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
    }
}
