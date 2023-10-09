package mandatoryHomeWork.LinkedList;

import java.util.LinkedList;

import org.testng.annotations.Test;

//11,43,23,11,90
public class LinkedListImp {

	//	LinkedList<E> check = new LinkedList<>();

	public class Node{
		int data;
		Node next;
		Node(int key) {
			this.data = key;
			this.next = null;
		}
	}


	public Node addNode(int data) {

		return new Node(data);

	}

	public static int sizeOfList(Node curr1) {
		int counter =0;
		while(curr1.next!=null) {
			counter++;
			curr1 = curr1.next;
		}

		return counter;

	}
	public  Node reverseList(Node head) {
//		
//		 currentHead = new ListNode(head.val);
//         currentHead.next = previousNode;
//         previousNode= currentHead;
//         head = head.next;

		Node currentNode = head;
		Node previousNode = null;
		Node nextNode = null;
		
		while(currentNode!=null) {
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
	return previousNode;

}
public Node remove(Node curr1,int index) {
	Node head = curr1;
	Node tail = curr1;


	if(index==0) {
		head = head.next;
	}else {
		Node previous = head;
		for (int i = 0; i < index - 1; i++) {
			previous = previous.next;
		}
		Node current = previous.next;
		previous.next = current.next;
		if (current.next == null) {
			tail = previous;
		}
	}

	return curr1;

}
public Node removeAll(Node curr1,int data) {
	Node head = curr1;
	Node tail = curr1;
	return tail;

}

public Node clone(Node curr1) {
	Node head = null;
	Node tail = null;
	Node curr2 = null ;
	while(curr1.next!=null) {

		curr2  = addNode(curr1.data);
		if(head==null) {
			head = curr2;
			tail = curr2;
		}else {
			tail.next = tail = curr2;
			//				tail = curr;	
		}
		curr1 = curr1.next;
	}
	return head;

}

public int lastIndexOf(Node curr1,int data) {

	int lastIndex =-1;
	int currIndex = 0;
	while(curr1.next!=null) {
		if(curr1.data == data) {
			lastIndex = currIndex;
		}

		curr1 = curr1.next;
		currIndex++;
	}
	return lastIndex;

}


private Node getNodeAtIndex(int i) {
	// TODO Auto-generated method stub
	return null;
}

@Test
public void test() {

	int[] arr = new int[] {1,2,22222,2,3,4,5};
	Node head = null;
	Node tail = null;

	//size
	for (int i : arr) {
		Node curr  = addNode(i);
		if(head==null) {
			head = curr;
			tail = curr;
		}else {
			tail.next = tail = curr;
			//				tail = curr;	
		}
	}

	Node curr1 =head;
	while(curr1!=null) {
//					System.out.println(curr1.data);
		curr1 = curr1.next;
	}
//
//
//	//size
//	Node curr2 = head;
//	//		System.out.println(sizeOfList(curr2));
//
//	//remove
//	Node curr3 = remove(curr2,2);
//	while(curr3!=null) {
//		//						System.out.println(curr3.data);
//		curr3 = curr3.next;
//	}
//
//	//LastIndex 
//	Node curr4 = head;
//	System.out.println(lastIndexOf(curr4,2));
//
//
//	//clone 
//
//	Node curr5 = clone(curr4);
//	while(curr5!=null) {
//		System.out.println(curr5.data);
//		curr5 = curr5.next;
//	}
	
//	reverse LL
	
	Node curr12 =head;
	Node head2 = reverseList(curr12);
	while(head2!= null) {
		System.out.println(head2.data);
		System.out.println(head2);		
		System.out.println(head2.next);


		head2 = head2.next;
	}
	
}
}
