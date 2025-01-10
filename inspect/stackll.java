
public class stackll {

    public   static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
     
     static class stklinklist{
       public static Node head = null;
       public static Node tail = null;


   
    // empty
    public boolean empty(){
       return head == null;

    }

    // push
    public void push(int val){
        Node d = new Node(val);
        if ( head == null){
            head = d;
            tail = d;

        } else {
            d.next = head;
            head = d;
        }
    }

    // push
    public int pop(){
        Node temp = head;
        if( head == null){
            return -1;       
        }
        Node top = head;
        head = head.next;
         return temp.val;
    }

   public static int peek(){
        if ( head== null){
            return -1;
        } else {
            Node top = head;
            return top.val;
        }
   }
         
        
    }


    public static void main(String[] args) {
        stklinklist nn = new stklinklist();
        nn.push(45);
        nn.push(38);
        nn.push(34);
        nn.push(75);
        nn.push(76);

        while (!nn.empty()) {
            System.out.println(nn.peek());
            nn.pop();
        }

    }

}


    



    



