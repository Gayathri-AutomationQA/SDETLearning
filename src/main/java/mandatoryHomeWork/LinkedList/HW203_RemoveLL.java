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

		while(current!=null){
			if(current.val == val){
				if(current == head) {
					head= head.next;
					current = head;
				}else if(current.next==null){
					previous.next = null;
					break;
				}else{
					previous.next = current.next;
					current = current.next;
				}

			}else{
				previous= current;
				current = current.next;
			}

		}
		return head;
	}

}
