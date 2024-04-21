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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer>nums = new ArrayList<>();
        ListNode node = head;
        int counter = 0;
        int sum = 0;
        while(node.next != null){
            nums.add(node.val);
            counter++;
            node = node.next;
        }
        nums.add(node.val);
        counter++;
        for(int i = 0; i < nums.size(); i++){
            sum += nums.get(i) * Math.pow(2, counter-1);;
            counter--;
        }
        return sum;
    }
}