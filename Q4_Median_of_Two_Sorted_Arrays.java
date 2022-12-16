class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int numCount1 = nums1.length;
        int numCount2 = nums2.length;

        int totalNums = numCount1 + numCount2;
        int middleIndex = totalNums/2;

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        double temp1 = 0;
        double temp2 = 0;

        while (counter1 <= middleIndex){
            counter1++;
            temp1 = temp2;
            if(counter2 <= nums1.length-1 && counter3 <= nums2.length-1){
                if(nums1[counter2] >= nums2[counter3]){
                    temp2 = nums2[counter3++];
                }
                else{
                    temp2 = nums1[counter2++];
                }
            } 
            else if (counter2 <= nums1.length-1 && counter3 > nums2.length-1){
                temp2 = nums1[counter2++];
            }
            else if (counter2 > nums1.length-1 && counter3 <= nums2.length-1){
                temp2 = nums2[counter3++];
            }
        }
        if(totalNums % 2 == 0){
            return (temp1 + temp2)/2;
        }
        return temp2;
    }
}