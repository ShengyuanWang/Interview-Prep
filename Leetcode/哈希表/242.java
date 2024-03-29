class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> tb = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            tb.put(ch, tb.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            tb.put(ch, tb.getOrDefault(ch, 0) - 1);
            if (tb.get(ch) <0) {
                return false;
            }
        }
        return true;
    }
}
