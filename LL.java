//adding first and last in linked list..//

class LL{
    Node head;
    private int size;
    LL(){
        size=0;
    }
    public class Node{
        String data;
        Node next;
        Node (String data){
            this.data=data;
            this.next=null;
            size++;
        }

    }
    public void first(String data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    public void last(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;

        }
        Node last=head;
        while(last.next!=null){
         last=last.next;   
        }
            last.next=newnode;
        

    }
    public void print(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.first("is");
        list.first("komal");
        list.last("good");
        list.print();
    }
}