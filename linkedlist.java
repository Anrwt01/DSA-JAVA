public class linkedlist {
   public static class node{
        int val;
        node next;
    }

    public static class linklist{
        node head  = null;
        node tail = null;
        int size = 0;
        
    
        void insertATany(int idx, int val){
            node nn1 = new node();
            nn1.val = val;
            node temp = head;
        for (int i =1;i<=idx-1; i++){
            temp = temp.next; }

            if (idx == 0){
                insertAtFrst(val);
            } else if ( idx == size ) {
                insertAtend(val);
            }
                else { nn1.next = temp.next;
                temp.next = nn1;
                size++;
            }
        }

        void insertAtend(int val){
            node nn = new node();
            nn.val = val;
                 if( head==null){
                    head=tail=null;
                 } else {
                    tail.next=nn;
                    tail = nn;
                    size++;
                 } 
        }
        
        void insertAtFrst( int val){
           node nn = new node();
            nn.val = val;
            if ( head == null){
                head = nn;
                tail = nn;
            } else {
                nn.next = head;
                head = nn;
                size++;

            }
        }
        
           void display(){
            node temp = head;
            while(temp!=null){
                System.out.print(temp.val+ "-->");
                temp= temp.next;
            }
            System.out.println("null");
        } 
          
        int getfrdt(){
            return head.val;
        }

        int getlast(){
            return tail.val;
        }
          

        void removeAtIndex(int idx){
            node temp = head;
            for (int i =1;i<=idx-1; i++){
                temp = temp.next; }
       
           temp.next = temp.next.next;

            }

            void removefrst( int idx){
                node temp =head;
                head =head.next;
                temp.next = null;
                size--;
            }s

        
        
        }
            public static void main(String[] args) {
                linklist ll = new linklist();
                
                
                ll.insertAtFrst(15);
                ll.insertAtFrst(5);
                ll.insertAtFrst(8);
                ll.insertAtFrst(17);
                ll.display();
                ll.insertAtend(77);
                ll.display();    
                ll.insertATany(5,99);    
                ll.display();   
                System.out.println(ll.getfrdt());   
                System.out.println(ll.getlast());                        
                ll.removeAtIndex(3);
                ll.display();   
                ll.removefrst(0);         
    }
                    
                              
    
    }

