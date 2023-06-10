class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
}

public class Program8 {
	 Node start = null;
	    void create(){
	        
	        start = new Node(10);
	        start.next = new Node(20);
	        start.next.next = new Node(30);
	        start.next.next.next = new Node(40);
	        start.next.next.next.next = new Node(50);
	        
	        
	        
	        while (start!=null) {            
	            System.out.println("  ---> "+start.data);
	            
	            start = start.next;
	        }
	        
	        
	    }
	    
	    public static void main(String[] args) {
	        
	        
	        new Program8
	        ().create();
	    }
	    
	}