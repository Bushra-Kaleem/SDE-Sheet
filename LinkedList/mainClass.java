package LinkedList;
public class mainClass {      
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }      
    public Node head = null;    
    public Node tail = null;      
    public void addNode(int data) {     
        Node newNode = new Node(data);      
        if(head == null) {      
            head = newNode;    
            tail = newNode;    
        }    
        else {      
            tail.next = newNode;      
            tail = newNode;    
        }    
    }       
        
    public static void main(String[] args) {    
            
        mainClass sList = new mainClass();    
            
        //Add nodes to the list    
        sList.addNode(1);    
        sList.addNode(2);    
        sList.addNode(3);    
        sList.addNode(4);   
        Node res=reverseLL(sList.head); 
        while(res!=null){
            System.out.print(res.data+" ");
            res=res.next;
        }  
    }

    private static Node reverseLL(Node head2) {
        Node dummy=null;
        if(head2==null)
            return dummy;
        while(head2!=null){
            Node next=head2.next;
            head2.next=dummy;
            dummy=head2;
            head2=next;
        }
        return dummy;
    }    
}    