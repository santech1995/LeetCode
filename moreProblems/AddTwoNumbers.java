//AddingTwoNumbers

class Solution {
    public int sum(int num1, int num2) {
        if( num1 == 0 && num2 > 0) return num2;
        else if(num2 == 0 && num1 > 0) return num1;
        else if(num1 < -100 || num2 > 100) {
            System.out.println("Enter a number within the range -100 to 100");
            return 0;
        }
        else return (num1 + num2);
    }
}