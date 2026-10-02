import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int LongestLength = 0;
        Set<Character> charSet = new HashSet<>();
        for(int end = 0;end<s.length();end++){
          while(charSet.contains(s.charAt(end))){
                charSet.remove(s.charAt(start));
                start +=1;
            }
            charSet.add(s.charAt(end));
            LongestLength = Math.max(LongestLength,end-start+1);
        }
        return LongestLength;
    }
}