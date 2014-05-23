package linkedlist;

public class Demo {
	public static void main(String args[]){
		Node head = Operations.createNewLL();
		Operations.addNodeLL(head, 3);
		Operations.addNodeLL(head, 8);
		Operations.addNodeLL(head, 99);
		Operations.addNodeLL(head, 32);
		Operations.printLL(head);
		System.out.println();
		Operations.printReverse(head);
	}

}
