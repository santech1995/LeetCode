class Solution {
    public int[] searchRange(int[] nums, int target) {
         if (nums == null || nums.length == 0) {
             int[] resultArray = {-1, -1};
             return resultArray;
         }
         int temp1 = -1;
         int temp2 = -1;
         int i = 0;
          int j = nums.length-1;
        do {
            if (nums[i] == target && nums != null) {
                temp1 = i;
                break;
            } else {
                temp1 = -1;
            }
            i++;
            } while (temp1 == -1 && i < nums.length);
        do {
            if (nums[j] == target && nums != null) {
                temp2 = j;
                break;
            } else {
                temp2 = -1;
            }
            j--;
        } while (temp2 == -1 && j >= 0);
        int[] resultArray = {temp1,temp2};
        return resultArray;
    }
}