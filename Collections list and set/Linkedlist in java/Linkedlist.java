public class Linkedlist{
    Node head;
    public void insertAtLast(int data){
        Node newnode= new Node(data);

        if(head ==null){
            head = newnode;
            return ; 
        }

        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next= newnode;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}