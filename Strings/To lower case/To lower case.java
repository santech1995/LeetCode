/*Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

 

Example 1:

Input: "Hello"
Output: "hello"
Example 2:

Input: "here"
Output: "here"
Example 3:

Input: "LOVELY"
Output: "lovely"*/

class Solution {
    public String toLowerCase(String str) {
        char[] a = str.toCharArray();
        for(int i = 0; i < a.length; i++) {
            if(a[i] >= 'A' && a[i] <= 'Z')
                a[i] = (char)(a[i] + 'a' - 'A');
        }
        return new String(a);
    }
}