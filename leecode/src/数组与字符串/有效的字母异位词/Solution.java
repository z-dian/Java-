package 数组与字符串.有效的字母异位词;

/*
给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
示例 1:
输入: s = "anagram", t = "nagaram"
输出: true
示例 2:
输入: s = "rat", t = "car"
输出: false
 */
public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (char ch : s.toCharArray()) {
            counter[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            counter[ch - 'a']--;
        }
        for (int i = 0; i < counter.length; i++) {
            if(counter[i]!=0){
                return false;
            }
        }
        return true;
    }
}
