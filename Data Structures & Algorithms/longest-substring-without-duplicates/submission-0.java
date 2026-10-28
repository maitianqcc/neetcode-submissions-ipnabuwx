class Solution {
    public int lengthOfLongestSubstring(String s) {
        
         if (s == "" || s.length() == 0) return 0;
        int result = 0;
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();
        while(right < s.length()) {
            char c = s.charAt(right);
            if (set.add(c)) {
                result = Math.max(result, set.size());
                right++;
            } else { 
                set.remove(s.charAt(left++));
                //while ( )
            }
        }
        return result;
    }
}
