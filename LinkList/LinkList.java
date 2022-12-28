package LinkidList;

public class LinkList {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
		
		
	}
	public static Node head;
	public static Node tail;
	public static int size;
	public void AddFirst(int data) {
		//step1: create an new node
		Node nn=new Node(data);
		size++;
		if(head==null) {
			head=tail=nn;
			return;
		}
		//step 2 : new node next=head ;
		nn.next=head; // link next list kaa adress store heya
		
		head=nn;
	}
	public void AddLast(int data) {
		Node nn=new Node(data);
		size++;
		if(tail==null) {
			head=tail=nn;
			return;
		}
		tail.next=nn;
		tail=nn;
	}
    public void print() {
	Node temp=head;
	if(head==null) {
		System.out.println("LL is empty");
		return;
	}
	while(temp!=null) {
		System.out.print(temp.data+"->");
		temp=temp.next;
		
	}
	System.out.println("null");
	
}
    public void InsertinMiddle(int index,int data) {
	Node newnode=new Node(data);
	if(index==0) {
		AddFirst(data);
		return;
	}
	size++;
	Node temp=head;
	int i=0;
	while(i<index-1) {
		temp=temp.next;
	       i++;
	}
	newnode.next=temp.next;
	temp.next=newnode;
}
 
    public int removeFirst() {
    	if(size==0) {
    		System.out.print("node is empty");
    		return 0;
    	}
    	else if(size==1) {
    		int val=head.data;
    		head=tail=null;
    		return val;
    	}
    	
    	int val=head.data; //first element
    	head=head.next; 
    	size--;//change first element head to next head element
    	return val; // return 1st element 
    }
    public int removeLast() {
    	if(size==0) {
    		System.out.print("node is empty");
    		return 0;
    	}
    	else if(size==1) {
    		int val=head.data;
    		head=tail=null;
    		size=0;
    		return val;
    	}
    	Node prev=head;
    	//int prev=size-2;
    	for(int i=0;i<size-2;i++) {
    		prev=prev.next;
    	}
    	int val=prev.next.data; //tail.data
    	prev.next=null; 
    	size--;
    	return val;
    	
    }
    public int Search(int key) {
    	Node temp=head;
    	int i=0;
    	while(temp!=null) {
    		if(temp.data==key) {
    			return i;
    		}
    		temp=temp.next;
    		i++;
    	}
    	return -1;
    
    }
    
        public static void main(String[] args) {
		// TODO Auto-generated method 
               LinkList ll=new LinkList();
               //ll.print();
              ll.AddFirst(1);
              //ll.print();
              ll.AddFirst(2);
              //ll.print();
              ll.AddLast(3);
              //ll.print();
              ll.AddLast(4);
              ll.AddLast(3);
             
              ll.InsertinMiddle(2,9);
              ll.print();
               System.out.println(ll.size);
               ll.removeFirst();
               ll.print();
               ll.removeLast();
                 ll.print();
                System.out.println(ll.Search(4)); 
                System.out.println(ll.Search(10));
                 //ll.print();
               }

}
