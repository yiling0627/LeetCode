package leetcode;

import java.util.HashMap;

//Runtime: 16 ms.
//Time Complexity: O(n).

public class LongestSubstring {

    public int longestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128];
        for(int j =0, i =0; j < n; j++){
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        LongestSubstring l = new LongestSubstring();
        String s = "abcddsdiwoajjjjjshdbbsufjaaagawuuiiwuagri";
        System.out.println(s.charAt(0));
        System.out.println(l.longestSubstring(s));
    }
}
