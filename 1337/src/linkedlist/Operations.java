package linkedlist;

public class Operations {
	public static Node createNewLL(){
		Node n = new Node();
		n.setData(0);
		n.setNext(null);
		return n;
	}
	
	public static boolean addNodeLL(Node head,int data){
		if(head==null) return false;
		head.setData(head.getData()+1);
		Node n = new Node();
		n.setData(data);
		n.setNext(null);
		while(head.getNext()!=null){
			head=head.getNext();
		}
		head.setNext(n);
		return true;
		
	}
	
	public static void printLL(Node head){
    System.out.println();
		while(head!=null){
			System.out.print(" > "+head.getData());
			head=head.getNext();
		}
	}
	
	public static void printReverse(Node head){
		if(head==null) return;
		printReverse(head.getNext());
		System.out.print(" > "+head.getData());
		
	}
	
}
