public class Main {
    public static void main(String[] args) {
        Node frist=new Node(1);
       Node second=new Node(2);
       Node third=new Node(3);
       frist.next=second;
       second.next=third;
       Node head =frist;
       Node current = head;
      while (current != null){
          System.out.println(current.data);
          current=current.next;
      }
    }
}