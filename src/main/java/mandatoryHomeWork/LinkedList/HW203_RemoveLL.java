package mandatoryHomeWork.LinkedList;

public class HW203_RemoveLL {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	public ListNode removeElements(ListNode head, int val) {

		ListNode current = head;
		ListNode previous = null;

		while(current!=null && current.next!=null){
			System.out.println(current.val);
			if(current.val == val){
				if(previous == null){
					head = head.next;
				}else{
					previous.next = current.next;
				}

			}
			previous = current;
			current = current.next;
		}
		return head;
	}

}
