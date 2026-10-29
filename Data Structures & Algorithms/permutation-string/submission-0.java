class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] count = new int[26];
        for (char c : s1.toCharArray()) count[c -'a']++;
        int left = 0, right = 0;
        boolean result = true;
        while (right < s1.length()) {
            count[s2.charAt(right++) - 'a']--;
        }
        if (allZero(count)) return true;
        
        while (right < s2.length()) {
            
            count[s2.charAt(left) - 'a']++;
            count[s2.charAt(right) - 'a']--;
            
            if(allZero(count)) return true;
            left++;
            right++;
        }
        return false;
    }
    public boolean allZero(int[] count) {
        for (int temp: count) {
            if (temp != 0) return false;
        }
        return true;
    
    }
}
