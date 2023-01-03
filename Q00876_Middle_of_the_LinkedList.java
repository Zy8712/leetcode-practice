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
class Solution {
    public ListNode middleNode(ListNode head) {
        int counter = 1;
        int middle = 0;
        ListNode nextNode = head.next;
        while (nextNode != null){
            nextNode = nextNode.next; 
            counter++;
        }

        middle = (int)Math.ceil(counter/2);

        nextNode = head;
        for (int i = 0; i < middle; i++){
            nextNode = nextNode.next;
        }
        return nextNode;
    }
}
