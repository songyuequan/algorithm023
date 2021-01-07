
/**
 * 使用双指针，一个指针指向值较小的元素，一个指针指向值较大的元素。
 * 指向较小元素的指针从头向尾遍历，指向较大元素的指针从尾向头遍历。
 */

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
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


    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int[] result1 = twoSum(arr, 13);
        int[] result2 = twoSum(arr, 17);
        int[] result3 = twoSum(arr, 18);
        System.out.println(result1[0] + " and " + result1[1]);
        System.out.println(result2[0] + " and " + result2[1]);
        System.out.println(result3[0] + " and " + result3[1]);
    }
}
