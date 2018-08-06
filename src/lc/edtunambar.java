package lc;


public class edtunambar {
/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

Two things to make the code simple:

Whenever one of the two ListNode is null, replace it with 0.
Keep the while loop going when at least one of the three conditions is met.
 */
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	ListNode prev = new ListNode(0);
    ListNode head = prev;
    int carry = 0;
    while (l1 != null || l2 != null || carry != 0) {
        ListNode cur = new ListNode(0);
        int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
        cur.val = sum % 10;
        carry = sum / 10;
        prev.next = cur;
        prev = cur;
        
        l1 = (l1 == null) ? l1 : l1.next;
        l2 = (l2 == null) ? l2 : l2.next;
    }
    return head.next;
    }

public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	    	  val = x; 
	    	  }
	  }

}
