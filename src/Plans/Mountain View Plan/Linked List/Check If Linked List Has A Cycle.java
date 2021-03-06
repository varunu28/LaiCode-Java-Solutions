/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */
public class Solution {
  public boolean hasCycle(ListNode head) {
    // write your solution here
    ListNode slow = head;
    ListNode fast = head;
    
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      
      if (fast != null && slow != null && fast == slow) {
        return true;
      }
    }
    
    return false;
  }
}

