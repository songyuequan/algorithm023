import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/valid-anagram/
 *
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 示例1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 *
 * 示例 2:
 *
 * 输入: s = "rat", t = "car"
 * 输出: false
 *
 * 说明:
 * 你可以假设字符串只包含小写字母。
 *
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 *
 */
public class ValidAnagram {

    /**
     * 排序后比较一下
     * @param s
     * @param t
     * @return
     */
    public  static boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray,tArray);
    }




    /**
     * 第二种解法  如果是一个异位词  那么字母出现的次数应该是一样的
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] alpha = new int[26];
        for(int i = 0; i< s.length(); i++) {
            alpha[s.charAt(i) - 'a'] ++;
            alpha[t.charAt(i) - 'a'] --;
        }

        for(int i=0;i<26;i++){
            if(alpha[i] != 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram2("rat","car"));
    }
}
