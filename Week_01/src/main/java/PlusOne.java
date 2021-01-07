



/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * 链接：https://leetcode-cn.com/problems/plus-one
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {


        /**
         * 1. 末尾几位都是9直接赋值0
         * 2. 没有9  直接+1
         *
         */
        for (int i = digits.length-1; i >=0;  i--) {
            if (digits[i]==9){
                digits[i] = 0;
                if (i == 0){
                    int[] big = new int[digits.length+1];
                    big[0] = 1;
                    for (int j = 0; j < digits.length; j++) {
                        big[j+1] = digits[j];
                    }
                    return big;
                }
            }else {
                digits[i]++;
                return digits;
            }
        }

        return digits;


    }
}
