import java.lang.*;
class Solution {
    public int maxArea(int[] height) {
        int a_pointer = 0;
        int b_pointer = height.length - 1;
        int i = 0;
        int area = 0;
        while(i < height.length) {
            if (height[a_pointer] < height[b_pointer]) {
                area = Math.max(area,(height[a_pointer] * Math.abs(b_pointer - a_pointer)));
                a_pointer++;
            } else {
                area = Math.max(area,(height[b_pointer] * Math.abs(a_pointer - b_pointer)));
                b_pointer--;
            }
            i++;
        }
        return area;
    }
}