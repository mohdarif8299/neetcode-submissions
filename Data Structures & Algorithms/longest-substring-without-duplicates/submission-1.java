class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        Set<Character> set = new HashSet<>();
        int p1 = 0, p2 = 1;
        int max = 1;
        set.add(s.charAt(p1));
        while(p1<s.length() && p2<s.length()) {
            if(set.contains(s.charAt(p2))) {
                set.remove(s.charAt(p1));
                p1++;
            } else {
                set.add(s.charAt(p2));
                max = Math.max(max, Math.abs(p2-p1)+1);
                p2++;
            }
            
        }

        return max;
    }
}
