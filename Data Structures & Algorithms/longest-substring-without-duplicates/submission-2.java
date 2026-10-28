class Solution {
    public int lengthOfLongestSubstring(String s) {
        
         if (s == "" || s.length() == 0) return 0;
        int result = 0;
        int left = 0;
        int right = 0;
        Map<Character, Integer> map = new HashMap<>();
        while(right < s.length()) {
            char c = s.charAt(right);
            if (!map.containsKey(c)) {
                map.put(c, right);
                
            } else {
                left = Math.max(left, map.get(c) + 1);
                map.put(c, right);
            }
            result = Math.max(result, right - left + 1);
            right++;

        }
        return result;
    }
}
