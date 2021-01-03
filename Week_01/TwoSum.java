
/**
 * 使用双指针，一个指针指向值较小的元素，一个指针指向值较大的元素。
 * 指向较小元素的指针从头向尾遍历，指向较大元素的指针从尾向头遍历。
 */

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j < nums.length; j++){
                if (nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
