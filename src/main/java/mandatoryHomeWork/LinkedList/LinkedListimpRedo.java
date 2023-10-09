package mandatoryHomeWork.LinkedList;

import org.testng.annotations.Test;

import mandatoryHomeWork.LinkedList.LinkedListImp.Node;

public class LinkedListimpRedo {

	public class Node{
		int data ;
		Node next;
		Node(int key){
			this.data = key;
			this.next = null;
		}
	}
	
	public Node addNode(int data) {
		return new Node(data);
	}
	
	@Test
	public void test() {
		int[] arr = new int[] {1,2,3,4};
		Node head = null;
		Node tail = null;
		
		for (int i : arr) {
			Node curr = addNode(i);
			if(head == null) {
				head = curr;
				tail = curr;
			}else {
				tail.next = curr;
				tail = curr;
			}
		}
		
		Node curr1 =head;
		while(curr1!=null) {
			System.out.println(curr1.data);
			curr1 = curr1.next;
		}
	}
}
